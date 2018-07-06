#### Starcraft Simulator v1.0
Ever wondered whether two ghosts kill a maxed out queen? Wonder no more as
this simulator gives you the option of picking two army compositions and
simulating a battle between them. No micro is assumed and the armies engage
in battle by running towards eachother and attacking the first unit that's
within range and vision.

#### TODO:
1. Give booleans to the player representing the tech tree. When a building gets removed,
go through the list of present buildings and check if it was the last one of that kind.
If it was, deactivate the has*BuildingName* boolean of the player. So, the player has a cybernetics
core and the twilight council checks whether the player has a cybernetics core. If the player does have
a cybernetics core and also fulfills the resource criteria, then isBuildable = true.

2. When creating buildings and units attribute the player who is creating them to the building/unit.
Maybe in the constructor of the building/unit.