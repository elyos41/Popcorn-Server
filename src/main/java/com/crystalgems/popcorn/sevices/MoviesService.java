package com.crystalgems.popcorn.sevices;

import com.crystalgems.popcorn.hibernate.HibernateUtil;
import com.crystalgems.popcorn.model.Movies;
import org.hibernate.HibernateException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Antoine on 03/03/2017.
 */
@Path("movies")
public class MoviesService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMovies() {
        String res = "";
        try {
            HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
            List movies = HibernateUtil.getSessionFactory().getCurrentSession().createQuery("from Movies").list();
            for (Iterator iterator = movies.iterator(); iterator.hasNext(); ) {
                Movies movie = (Movies) iterator.next();
                res += movie.getTitleMovieLens() + " (" + movie.getDate() + ")\n";
            }
            HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
            return res;
        } catch (HibernateException e) {
            HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().rollback();
            throw e;
        }
    }

    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Movies getMovieInJSON() {
        Movies movies = new Movies();
        movies.setMovieId(1);
        movies.setDate(new Date(System.currentTimeMillis()));
        movies.setTitleImdb("My movie IMB");
        movies.setTitleMovieLens("My movie ML");
        return movies;
    }
}
