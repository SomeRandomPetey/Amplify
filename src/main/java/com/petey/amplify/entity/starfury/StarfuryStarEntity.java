package com.petey.amplify.entity.starfury;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class StarfuryStarEntity extends ProjectileEntity {

    private Direction currentMoveDirection;
    private int health = 5;
    private int age;
    private Entity finalTarget;



    public StarfuryStarEntity(EntityType<? extends StarfuryStarEntity> entityType, World world) {
        super(entityType, world);
        this.noPhysics = true;
    }



    @Override
    protected void defineSynchedData() {
    }

    @Override
    protected void readAdditionalSaveData(CompoundNBT pCompound) {
        this.age = pCompound.getShort("Age");

    }

    @Override
    protected void addAdditionalSaveData(CompoundNBT pCompound) {
        pCompound.putShort("Age", (short)this.age);
    }

    @Override
    public IPacket<?> getAddEntityPacket() {
        return new SSpawnObjectPacket(this);
    }



    @Override
    protected void onHitEntity(EntityRayTraceResult entityResult) {
        super.onHitEntity(entityResult);
    }

    @Override
    protected void onHitBlock(BlockRayTraceResult blockResult) {
        super.onHitBlock(blockResult);
    }

    @Override
    protected void onHit(RayTraceResult result) {
        super.onHit(result);
        this.remove();
    }

    //Remove if: Exists for more than 5 seconds, touches ground, touches another entity.
    //Move towards the attacked entity (Ray casting or smth? idk)
    @Override
    public void tick() {
        super.tick();

        age++;
        if(age >= 100) {
            this.remove();
        }
    }

}
