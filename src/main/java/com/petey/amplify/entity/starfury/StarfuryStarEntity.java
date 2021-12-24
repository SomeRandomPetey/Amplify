package com.petey.amplify.entity.starfury;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;

public class StarfuryStarEntity extends ProjectileEntity {


    public StarfuryStarEntity(EntityType<? extends ProjectileEntity> entityType, World worldIn) {
        super(entityType, worldIn);
    }

    @Override
    protected void defineSynchedData() {

    }

    @Override
    protected void readAdditionalSaveData(CompoundNBT pCompound) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundNBT pCompound) {

    }

    @Override
    public IPacket<?> getAddEntityPacket() {
        return null;
    }


}
