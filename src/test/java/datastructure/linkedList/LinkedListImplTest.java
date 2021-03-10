package datastructure.linkedList;

import org.junit.jupiter.api.Test;

import datastructure.linkedList.LinkedListImpl.Node;
import datastructure.linkedList.LinkedListImpl.NodeMgmt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListImplTest {

    @Test
    void add_테스트() {
        // given
        NodeMgmt nodeMgmt = new NodeMgmt(new Node(1, null));

        // when1

        // then1
        assertEquals(nodeMgmt.getHeadData(), 1);
        assertNull(nodeMgmt.getHead().getNext());

        // when2
        nodeMgmt.add(2);

        // then2
        assertEquals(nodeMgmt.getHeadData(), 1);
        assertEquals(nodeMgmt.getHead().getNextData(), 2);
    }

    @Test
    void describe_테스트() {
        // given
        NodeMgmt nodeMgmt = new NodeMgmt(new Node(1, null));

        // when
        nodeMgmt.add(2);

        // then
        nodeMgmt.describe();
    }

    @Test
    void delete_테스트() {
        // given
        NodeMgmt nodeMgmt = new NodeMgmt(new Node(1, null));

        // when

        // then
        assertFalse(nodeMgmt.delete(2));
        assertTrue(nodeMgmt.delete(1));
        assertThrows(NullPointerException.class, () ->
            nodeMgmt.delete(1));
    }

    @Test
    void search_테스트() {
        // given
        NodeMgmt nodeMgmt = new NodeMgmt(new Node(1, null));

        // when1
        nodeMgmt.delete(1);

        // then1
        assertThrows(NullPointerException.class, () ->
            nodeMgmt.search(1));

        // when2
        nodeMgmt.add(1);
        nodeMgmt.add(2);

        // then2
        assertEquals(nodeMgmt.search(1).getData(), 1);
        assertEquals(nodeMgmt.search(2).getData(), 2);
        assertNull(nodeMgmt.search(3));
    }
}
