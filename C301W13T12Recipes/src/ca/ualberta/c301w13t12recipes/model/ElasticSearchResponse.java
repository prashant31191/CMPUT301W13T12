package ca.ualberta.c301w13t12recipes.model;

/**
 * Internal data structure for handling response from elastic search
 *
 */

public class ElasticSearchResponse<T> {
    String _index;
    String _type;
    String _id;
    int _version;
    boolean exists;
    T _source;
    double max_score;
    public T getSource() {
        return _source;
    }
}
