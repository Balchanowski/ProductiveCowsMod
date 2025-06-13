package net.staszek.productivecows.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.staszek.productivecows.ProductiveCows;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ProductiveCows.MOD_ID);

    public static final DeferredItem<Item> Base_bucket_upgrade = ITEMS.register("basebucketupgrade", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Drip_bucket_upgrade = ITEMS.register("dripbucketupgrade", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Stream_bucket_upgrade = ITEMS.register("streambucketupgrade", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Blast_bucket_upgrade = ITEMS.register("blastbucketupgrade", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Void_bucket_upgrade = ITEMS.register("voidbucketupgrade", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> Speed_bucket_upgrade = ITEMS.register("speedbucketupgrade", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Speedier_bucket_upgrade = ITEMS.register("speedierbucketupgrade", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Speediest_bucket_upgrade = ITEMS.register("speediestbucketupgrade", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> Cream_bucket_upgrade = ITEMS.register("creambucketupgrade", () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
