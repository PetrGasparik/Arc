package io.anuke.arc.tiled;

import io.anuke.arc.collection.IntMap;
import io.anuke.arc.maps.MapProperties;
import io.anuke.arc.maps.tiled.TiledMapTile;

import java.util.Iterator;

public class TileSet implements Iterable<TiledMapTile>{
    private String name;
    private IntMap<TiledMapTile> tiles = new IntMap<>();
    private MapProperties properties = new MapProperties();

    /** @return tileset's name */
    public String getName(){
        return name;
    }

    /** @param name new name for the tileset */
    public void setName(String name){
        this.name = name;
    }

    /** @return tileset's properties set */
    public MapProperties getProperties(){
        return properties;
    }

    /**
     * Gets the {@link TiledMapTile} that has the given id.
     * @param id the id of the {@link TiledMapTile} to retrieve.
     * @return tile matching id, null if it doesn't exist
     */
    public TiledMapTile getTile(int id){
        return tiles.get(id);
    }

    /**
     * Adds or replaces tile with that id
     * @param id the id of the {@link TiledMapTile} to add or replace.
     * @param tile the {@link TiledMapTile} to add or replace.
     */
    public void putTile(int id, TiledMapTile tile){
        tiles.put(id, tile);
    }

    /** @param id tile's id to be removed */
    public void removeTile(int id){
        tiles.remove(id);
    }

    /** @return the size of this TiledMapTileSet. */
    public int size(){
        return tiles.size;
    }

    /** @return iterator to tiles in this tileset */
    @Override
    public Iterator<TiledMapTile> iterator(){
        return tiles.values().iterator();
    }
}
