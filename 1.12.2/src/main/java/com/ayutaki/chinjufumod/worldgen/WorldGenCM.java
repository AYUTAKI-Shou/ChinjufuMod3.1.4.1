package com.ayutaki.chinjufumod.worldgen;

import java.util.Random;

import com.ayutaki.chinjufumod.config.CMConfigCore;
import com.ayutaki.chinjufumod.init.ChinjufuModBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCM implements IWorldGenerator {

	private WorldGenerator bauxite_cm;

	public WorldGenCM() {
		bauxite_cm = new WorldGenMinable(ChinjufuModBlocks.BAUXITE_ORE.getDefaultState(), 8);

	}

	private void runGenerator(WorldGenerator gen, World world, Random rand,
			int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256)
			throw new IllegalArgumentException("Ore generated out of bounds");
		int heightDiff = maxHeight - minHeight + 1;

		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);

			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ,
			World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

		/*ifを追加*/
		if (CMConfigCore.isGeneratorEnabled && world.provider instanceof WorldProviderSurface) {

			switch (world.provider.getDimension()) {

			case 0: //オーバーワールド Coal=142,Iron=77,RedStone=25,Gold=8,Lapiz=3.4
				this.runGenerator(bauxite_cm, world, random, chunkX, chunkZ, 25, 10, 70);
				break;

			case -1: // ネザー
				break;

			case 1: // エンド
				break;
			}
		}
	}

}