package com.flansmod.apocalypse.common.world;

import java.util.Random;

import com.flansmod.apocalypse.common.entity.EntitySurvivor;

import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;

public class BiomeDesertCanyon extends BiomeApocalypse
{
    private final int field_150635_aE = 0, field_150636_aF = 1, field_150637_aG = 2;
    
    public BiomeDesertCanyon(Biome.BiomeProperties properties)
    {
    	super(properties);
    	
		spawnableMonsterList.clear();
		//spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySurvivor.class, 1, 1, 1));
		spawnableCreatureList.clear();
		topBlock = Blocks.SAND.getStateFromMeta(1);
		fillerBlock = Blocks.SAND.getStateFromMeta(1);
    }
	
	@Override
    public float getSpawningChance()
    {
        return 1F;
    }
}
