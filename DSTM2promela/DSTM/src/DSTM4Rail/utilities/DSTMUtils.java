package DSTM4Rail.utilities;


import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import DSTM4Rail.*;

public class DSTMUtils {
	
	public static tInteger getTInteger(DSTM dstm) {
		for (Type type : dstm.getTypes()) {
			if (type instanceof tInteger)
				return (tInteger) type;
		}
		return null;
	}
	
	public static tEnum getTBool(DSTM dstm) {
		for (Type type : dstm.getTypes()) {
			if (type instanceof tEnum && type.getName().compareTo("Bool") == 0)
				return (tEnum) type;
		}
		return null;
	}
	
	public static tChannel getTChanOfBool(DSTM dstm) {
		for (Type type : dstm.getTypes()) {
			if (type instanceof tChannel && type.getName().compareTo("Chn[Bool]") == 0)
				return (tChannel) type;
		}
		return null;
	}

	public static EList<Transition> getEnteringTransitions(Vertex v) {
		EList<Transition> ret = new BasicEList<Transition>();
		for (Transition t : v.getMachine().getTransitions()) {
			if (t.getDestination().equals(v))
				ret.add(t);
		}
		return ret;
	}

	public static EList<Transition> getExitingTransitions(Vertex v) {
		EList<Transition> ret = new BasicEList<Transition>();
		for (Transition t : v.getMachine().getTransitions()) {
			if (t.getSource().equals(v))
				ret.add(t);
		}
		return ret;
	}
	
	public static boolean exitsAFork(Vertex v) {
		for (Transition t : v.getMachine().getTransitions()) {
			if (t.getDestination().equals(v) && t.getSource() instanceof Fork)
				return true;
		}
		return false;
	}

	public static boolean entersAJoin(Vertex v) {
		for (Transition t : v.getMachine().getTransitions()) {
			if (t.getSource().equals(v) && t.getDestination() instanceof Join)
				return true;
		}
		return false;
	}

	public static InitialNode getInitialNode(Machine m) {
		InitialNode ret = null;
		for (Vertex v : m.getVertexes()) {
			if (v instanceof InitialNode)
				ret = (InitialNode) v;
		}
		return ret;
	}

	public static EList<ExitingNode> getExitingNodes(Machine m) {
		EList<ExitingNode> ret = new BasicEList<ExitingNode>();
		for (Vertex v : m.getVertexes()) {
			if (v instanceof ExitingNode)
				ret.add((ExitingNode) v);
		}
		return ret;
	}
}
