package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Graph {

	private class Vertex {

		HashMap<String, Integer> nbrs = new HashMap<>();

	}

	HashMap<String, Vertex> vtces = new HashMap<>();

	public int numVertex() {
		return vtces.size();
	}

	public boolean containsVertex(String vname) {
		return vtces.containsKey(vname);
	}

	public void addVertex(String vname) {
		Vertex vtx = new Vertex();
		vtces.put(vname, vtx);
	}

	public void removeVertex(String vname) {

		if (!vtces.containsKey(vname)) {
			return;
		}

		Vertex vtx = vtces.get(vname);

		for (String key : vtx.nbrs.keySet()) {
			vtces.get(key).nbrs.remove(vname);
		}

		vtces.remove(vname);

	}

	public int numEdges() {

		int sum = 0;

		for (String key : vtces.keySet()) {
			sum += vtces.get(key).nbrs.size();
		}

		return sum / 2;
	}

	public boolean containsEdge(String vname1, String vname2) {

		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}

		return true;

	}

	public void addEdge(String vname1, String vname2, int cost) {

		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}

		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);

	}

	public void removeEdge(String vname1, String vname2) {

		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		}

		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);

	}

	public void display() {
		System.out.println("--------------------");
		for (String vtx : vtces.keySet()) {
			System.out.println(vtx + " - > " + vtces.get(vtx).nbrs);
		}
		System.out.println("--------------------");

	}

	public boolean hasPath(String src, String dst) {
		HashMap<String, Boolean> processed = new HashMap<>();
		return hasPath(src, dst, processed);
	}

	private boolean hasPath(String src, String dst, HashMap<String, Boolean> processed) {

		processed.put(src, true);

		if (containsEdge(src, dst)) {
			return true;
		}

		for (String key : vtces.get(src).nbrs.keySet()) {
			if (!processed.containsKey(key) && hasPath(key, dst, processed))
				return true;
		}

		return false;

	}

	private class Pair {
		String vname;
		String psf;

		String color;
	}

	public boolean bfs(String src, String dst) {

		LinkedList<Pair> queue = new LinkedList<>();

		Pair fp = new Pair();
		fp.vname = src;
		fp.psf = src;

		HashMap<String, Boolean> processed = new HashMap<>();

		queue.addLast(fp);

		while (!queue.isEmpty()) {

			Pair rp = queue.removeFirst();

			if (processed.containsKey(rp.vname)) {
				continue;
			}

			processed.put(rp.vname, true);

			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}

			Vertex vtx = vtces.get(rp.vname);

			for (String key : vtx.nbrs.keySet()) {

				if (!processed.containsKey(key)) {
					Pair np = new Pair();
					np.vname = key;
					np.psf = rp.psf + key;
					queue.addLast(np);
				}

			}

		}

		return false;

	}

	public boolean dfs(String src, String dst) {

		LinkedList<Pair> stack = new LinkedList<>();

		Pair fp = new Pair();
		fp.vname = src;
		fp.psf = src;

		HashMap<String, Boolean> processed = new HashMap<>();

		stack.addFirst(fp);

		while (!stack.isEmpty()) {

			Pair rp = stack.removeFirst();

			if (processed.containsKey(rp.vname)) {
				continue;
			}

			processed.put(rp.vname, true);

			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}

			Vertex vtx = vtces.get(rp.vname);

			for (String key : vtx.nbrs.keySet()) {

				if (!processed.containsKey(key)) {
					Pair np = new Pair();
					np.vname = key;
					np.psf = rp.psf + key;
					stack.addFirst(np);
				}

			}

		}

		return false;

	}

	public void bft() {

		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		for (String src : vtces.keySet()) {

			if (processed.containsKey(src)) {
				continue;
			}

			Pair fp = new Pair();
			fp.vname = src;
			fp.psf = src;

			queue.addLast(fp);

			while (!queue.isEmpty()) {

				Pair rp = queue.removeFirst();

				if (processed.containsKey(rp.vname)) {
					continue;
				}

				processed.put(rp.vname, true);

				System.out.println(rp.vname + " via " + rp.psf);

				Vertex vtx = vtces.get(rp.vname);

				for (String key : vtx.nbrs.keySet()) {

					if (!processed.containsKey(key)) {
						Pair np = new Pair();
						np.vname = key;
						np.psf = rp.psf + key;
						queue.addLast(np);
					}

				}

			}

		}

	}

	public boolean isConnected() {

		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();
		int count = 0;

		for (String src : vtces.keySet()) {

			if (processed.containsKey(src)) {
				continue;
			}

			Pair fp = new Pair();
			fp.vname = src;
			fp.psf = src;

			count++;

			queue.addLast(fp);

			while (!queue.isEmpty()) {

				Pair rp = queue.removeFirst();

				if (processed.containsKey(rp.vname)) {
					continue;
				}

				processed.put(rp.vname, true);

//				System.out.println(rp.vname + " via " + rp.psf);

				Vertex vtx = vtces.get(rp.vname);

				for (String key : vtx.nbrs.keySet()) {

					if (!processed.containsKey(key)) {
						Pair np = new Pair();
						np.vname = key;
						np.psf = rp.psf + key;
						queue.addLast(np);
					}

				}

			}

		}

		if (count == 1) {
			return true;
		}

		return false;

	}

	public boolean isCyclic() {

		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		for (String src : vtces.keySet()) {

			if (processed.containsKey(src)) {
				continue;
			}

			Pair fp = new Pair();
			fp.vname = src;
			fp.psf = src;

			queue.addLast(fp);

			while (!queue.isEmpty()) {

				Pair rp = queue.removeFirst();

				if (processed.containsKey(rp.vname)) {
					return true;
				}

				processed.put(rp.vname, true);

				Vertex vtx = vtces.get(rp.vname);

				for (String key : vtx.nbrs.keySet()) {

					if (!processed.containsKey(key)) {
						Pair np = new Pair();
						np.vname = key;
						np.psf = rp.psf + key;
						queue.addLast(np);
					}

				}

			}

		}

		return false;

	}

	public boolean isTree() {
		return isConnected() && !isCyclic();
	}

	public ArrayList<ArrayList<String>> getCC() {

		ArrayList<ArrayList<String>> ans = new ArrayList<>();

		LinkedList<Pair> queue = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		for (String src : vtces.keySet()) {

			ArrayList<String> subans = new ArrayList<>();

			if (processed.containsKey(src)) {
				continue;
			}

			Pair fp = new Pair();
			fp.vname = src;
			fp.psf = src;

			queue.addLast(fp);

			while (!queue.isEmpty()) {

				Pair rp = queue.removeFirst();

				if (processed.containsKey(rp.vname)) {
					continue;
				}

				processed.put(rp.vname, true);

				subans.add(rp.vname);

				Vertex vtx = vtces.get(rp.vname);

				for (String key : vtx.nbrs.keySet()) {

					if (!processed.containsKey(key)) {
						Pair np = new Pair();
						np.vname = key;
						np.psf = rp.psf + key;
						queue.addLast(np);
					}

				}

			}

			ans.add(subans);

		}

		return ans;

	}

//	public void isBipartite() {
//
//		LinkedList<Pair> queue = new LinkedList<>();
//		HashMap<String, Boolean> processed = new HashMap<>();
//
//		for (String src : vtces.keySet()) {
//
//			if (processed.containsKey(src)) {
//				continue;
//			}
//
//			Pair fp = new Pair();
//			fp.vname = src;
//			fp.psf = src;
//			fp.color = "r";
//
//			queue.addLast(fp);
//
//			while (!queue.isEmpty()) {
//
//				Pair rp = queue.removeFirst();
//
//				if (processed.containsKey(rp.vname)) {
//
//					String oc = rp.color ;
//					String nc = 
//					
//							
//							
//					
//					continue;
//				}
//
//				processed.put(rp.vname, true);
//
//				System.out.println(rp.vname + " via " + rp.psf);
//
//				Vertex vtx = vtces.get(rp.vname);
//
//				for (String key : vtx.nbrs.keySet()) {
//
//					if (!processed.containsKey(key)) {
//
//						String color = rp.color.equals("r") ? "g" : "r";
//
//						Pair np = new Pair();
//						np.vname = key;
//						np.psf = rp.psf + key;
//						np.color = color;
//						queue.addLast(np);
//					}
//
//				}
//
//			}
//
//		}

	}

//}
