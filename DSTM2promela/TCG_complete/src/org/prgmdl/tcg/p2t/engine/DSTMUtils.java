package org.prgmdl.tcg.p2t.engine;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import DSTM4Rail.ExitingNode;
import DSTM4Rail.InitialNode;
import DSTM4Rail.Machine;
import DSTM4Rail.Transition;
import DSTM4Rail.Vertex;
import DSTM4Rail.impl.ExitingNodeImpl;
import DSTM4Rail.impl.ForkImpl;
import DSTM4Rail.impl.InitialNodeImpl;
import DSTM4Rail.impl.JoinImpl;

public class DSTMUtils {

	public static EList<Transition> getEnteringTransitions(Vertex v, Machine m) {
		EList<Transition> ret = new BasicEList<Transition>();
		for (Transition t : m.getTransitions()) {
			if (t.getDestination().equals(v))
				ret.add(t);
		}
		return ret;
	}

	public static EList<Transition> getExitingTransitions(Vertex v, Machine m) {
		EList<Transition> ret = new BasicEList<Transition>();
		for (Transition t : m.getTransitions()) {
			if (t.getSource().equals(v))
				ret.add(t);
		}
		return ret;
	}

	public static boolean exitsAFork(Vertex v, Machine m) {
		for (Transition t : m.getTransitions()) {
			if (t.getDestination().equals(v) && t.getSource().getClass() == ForkImpl.class)
				return true;
		}
		return false;
	}

	public static boolean entersAJoin(Vertex v, Machine m) {
		for (Transition t : m.getTransitions()) {
			if (t.getSource().equals(v) && t.getDestination().getClass() == JoinImpl.class)
				return true;
		}
		return false;
	}

	public static InitialNode getInitialNode(Machine m) {
		for (Vertex v : m.getVertexes()) {
			if (v.getClass() == InitialNodeImpl.class)
				return (InitialNode) v;
		}
		return null;
	}

	public static EList<ExitingNode> getExitingNodes(Machine m) {
		EList<ExitingNode> ret = new BasicEList<ExitingNode>();
		for (Vertex v : m.getVertexes()) {
			if (v.getClass() == ExitingNodeImpl.class)
				ret.add((ExitingNode) v);
		}
		return ret;
	}
}
