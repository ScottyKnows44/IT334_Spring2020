package graphs;

import java.util.List;
import java.util.Set;

public interface IGraph<V>
{
    //insertion of data
    boolean addVertex(V vertex);
    void addVertices(V... vertices);
    boolean addEdge(V source, V dest);
    void addEdges(Edge... edges);

    //detection of elements
    boolean hasVertex(V vertex);
    boolean hasEdge(V source, V dest);

    //size of sets
    int vertexSize();
    int edgeSize();

    //removal of data
    boolean removeVertex(V vertex);
    boolean removeEdge(V source, V dest);

    //access to data
    Set<V> vertices();
    Set<Edge> edges();

    //fancy methods?
    int inDegree(V vertex);
    int outDegree(V vertex);
    boolean isComplete();
}









