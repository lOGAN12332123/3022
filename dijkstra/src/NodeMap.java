import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NodeMap
{
	private final Map<Integer, Node> nodes;
	private final Map<Integer, Integer> nodeIdToLValue;

	public NodeMap(List<Node> nodes)
	{
		this.nodes = new HashMap<>();
		this.nodeIdToLValue = new HashMap<>();

		for (Node node : nodes)
		{
			this.nodes.put(node.getId(), node);
			this.nodeIdToLValue.put(node.getId(), -1);
		}
	}

	public NodeMap()
	{
		this.nodes = new HashMap<>();
		this.nodeIdToLValue = new HashMap<>();
	}

	public void update(List<Node> nodes)
	{
		this.nodes.clear();
		this.nodeIdToLValue.clear();

		for (Node node : nodes)
		{
			this.nodes.put(node.getId(), node);
			this.nodeIdToLValue.put(node.getId(), -1);
		}
	}

	public Collection<Node> getNodes()
	{
		return nodes.values();
	}

	public void addNode(Node node)
	{
		this.nodes.put(node.getId(), node);
		this.nodeIdToLValue.put(node.getId(), -1);
	}

	public Integer getLValueByNodeId(int nodeId)
	{
		return nodeIdToLValue.get(nodeId);
	}

	public void setLValueByNodeId(int nodeId, int lValue)
	{
		nodeIdToLValue.put(nodeId, lValue);
	}

	public int size()
	{
		return this.nodes.size();
	}

	public boolean contains(Node node)
	{
		return getLValueByNodeId(node.getId()) != null;
	}

	public void clear()
	{
		this.nodes.clear();
		this.nodeIdToLValue.clear();
	}
}
