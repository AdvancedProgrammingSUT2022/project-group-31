package Enums;

public enum BuildingType {
    BARRACKS(80, 1, Technology.BRONZE_WORKING, null),
    GRANARY(100, 1, Technology.POTTERY, null),
    LIBRARY(80, 1, Technology.WRITING, null),
    MONUMENT(60, 1, null, null),
    WALLS(100, 1, Technology.MASONRY, null),
    WATER_MILL(120, 2, Technology.THE_WHEEL, null),
    ARMORY(130, 3, Technology.IRON_WORKING, new BuildingType[]{BARRACKS}),
    BURIAL_TOMB(120, 0, Technology.PHILOSOPHY, null),
    CIRCUS(150, 3, Technology.HORSEBACK_RIDING, null),
    COLOSSEUM(150, 3, Technology.CONSTRUCTION, null),
    COURTHOUSE(200, 5, Technology.MATHEMATICS, null),
    STABLE(100, 1, Technology.HORSEBACK_RIDING, null),
    TEMPLE(120, 2, Technology.PHILOSOPHY, new BuildingType[]{MONUMENT}),
    CASTLE(200, 3, Technology.CHIVALRY, new BuildingType[]{WALLS}),
    FORGE(150, 2, Technology.METAL_CASTING, null),
    GARDEN(120, 2, Technology.THEOLOGY, null),
    MARKET(120, 0, Technology.CURRENCY, null),
    MINT(120, 0, Technology.CURRENCY, null),
    MONASTERY(120, 2, Technology.THEOLOGY, null),
    UNIVERSITY(200, 3, Technology.EDUCATION, new BuildingType[]{LIBRARY}),
    WORKSHOP(100, 2, Technology.METAL_CASTING, null),
    BANK(220, 0, Technology.BANKING, new BuildingType[]{MARKET}),
    MILITARY_ACADEMY(350, 3, Technology.MILITARY_SCIENCE, new BuildingType[]{BARRACKS}),
    OPERA_HOUSE(220, 3, Technology.ACOUSTICS, new BuildingType[]{TEMPLE, BURIAL_TOMB}),
    MUSEUM(350, 3, Technology.ARCHAEOLOGY, new BuildingType[]{OPERA_HOUSE}),
    PUBLIC_SCHOOL(350, 3, Technology.SCIENTIFIC_THEORY, new BuildingType[]{UNIVERSITY}),
    SATRAPS_COURT(220, 0, Technology.BANKING, new BuildingType[]{MARKET}),
    THEATER(300, 5, Technology.PRINTING_PRESS, new BuildingType[]{COLOSSEUM}),
    WINDMILL(180, 2, Technology.ECONOMICS, null),
    ARSENAL(350, 3, Technology.RAILROAD, new BuildingType[]{MILITARY_ACADEMY}),
    BROADCAST_TOWER(600, 3, Technology.RADIO, new BuildingType[]{MUSEUM}),
    FACTORY(300, 3, Technology.STEAM_POWER, null), //TODO
    HOSPITAL(400, 2, Technology.BIOLOGY, null),
    MILITARY_BASE(450, 4, Technology.TELEGRAPH, new BuildingType[]{CASTLE}),
    STOCK_EXCHANGE(650, 0, Technology.ELECTRICITY, new BuildingType[]{BANK}); //TODO

    private int cost;
    private int maintenance;
    private Technology neededTechnology;
    private BuildingType[] neededBuildings;

    public int getCost() {
        return cost;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public Technology getNeededTechnology() {
        return neededTechnology;
    }

    BuildingType(int cost, int maintenance, Technology neededTechnology, BuildingType[] neededBuildings) {
        this.neededTechnology = neededTechnology;
        this.cost = cost;
        this.maintenance = maintenance;
        this.neededBuildings = neededBuildings;
    }
}
