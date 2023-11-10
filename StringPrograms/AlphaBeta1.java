import java.util.*;
public class AlphaBeta1{
    private int  alpha;
    private int beta;
    private String words;
   private int n;
   private String hideWords;
    String[] arr={ "ABET","ABLE","ABLY","ABUT","ACED","ACES","ACHE","ACHY","ACID","ACME","ACNE","ACRE","ACTS","ADDS","ADOO","AFAR","AFRO",
                 "AGED","AGES","AGOG","AHEM","AHOY","AIDE","AILS","AIMS","AINT","AIRS","AIRY","AJAR","AKIN","ALAS","ALLY","ALMS","ALOE",
                 "ALSO","ALTO","ALUM","AMEN","AMID","AMMO","AMOK","AMPS","ANAL","ANEW","ANTE","ANTI","ANTS","APES","APEX","APPS","AQUA",
                 "ARCH","AREA","ARGH","ARID","ARMS","ARMY","ARTS","ARTY","ASAP","ASHY","ASKS","ATOM","ATOP","AUNT","AURA","AUTO","AVID",
                 "AVOW","AWAY","AWOL","AWRY","AXEL","AXES","AXIS","AXLE","BABE","BABY","BACH","BACK","BADE","BAGS","BAIL","BAIN","BAIT",
                 "BAKE","BALD","BALE","BALK","BALL","BALM","BAND","BANE","BANG","BANK","BARB","BARD","BARE","BARF","BARK","BARN","BARS",
                 "BASE","BASH","BASK","BASS","BATH","BATS","BAYS","BEAD","BEAK","BEAM","BEAN","BEAR","BEAT","BEAU","BECK","BEDS","BEEF",
                 "BEEK","BEEP","BEER","BEES","BEET","BEGS","BELL","BELT","BEND","BENT","BERM","BEST","BETA","BETS","BEVY","BIAS","BIDE",
                 "BIDS","BIKE","BILE","BILK","BILL","BIND","BING","BINS","BIRD","BITE","BITS","BLAB","BLAH","BLED","BLEW","BLIP","BLOB",
                 "BLOC","BLOT","BLOW","BLUE","BLUR","BOAR","BOAT","BODE","BODY","BOGS","BOIL","BOLD","BOLE","BOLO","BOLT","BOMB","BOND",
                 "BONE","BONG","BONK","BONY","BOOB","BOOK","BOOM","BOON","BOOP","BOOT","BORE","BORN","BOSS","BOTH","BOTS","BOUT","BOWL",
                 "BOWS","BOYS","BOZO","BRAD","BRAG","BRAN","BRAS","BRAT","BRAY","BRED","BREW","BRIE","BRIG","BRIM","BROW","BUCK","BUDS",
                 "BUFF","BUGS","BULB","BULK","BULL","BUMP","BUMS","BUNK","BUNS","BUNT","BUOY","BURG","BURL","BURN","BURP","BURR","BURY",
                 "BUSH","BUSK","BUST","BUSY","BUTS","BUTT","BUYS","BUZZ","BYES","BYTE","CABS","CAFE","CAGE","CAKE","CALF","CALL","CALM",
                 "CAME","CAMP","CAMS","CANE","CANS","CANT","CAPE","CAPS","CARB","CARD","CARE","CARP","CARS","CART","CASE","CASH","CASK",
                 "CAST","CATS","CAVE","CEDE","CELL","CENT","CERT","CHAD","CHAP","CHAR","CHAT","CHEF","CHEW","CHIC","CHIN","CHIP","CHOP",
                 "CHOW","CHUG","CHUM","CITE","CITY","CLAD","CLAM","CLAN","CLAP","CLAW","CLAY","CLEF","CLIP","CLOD","CLOG","CLOP","CLOT",
                 "CLUB","CLUE","COAL","COAT","COAX","COCK","CODE","COED","COIF","COIL","COIN","COKE","COLA","COLD","COLT","COMA","COMB",
                 "COME","COMP","COMS","CONE","CONK","CONS","COOK","COOL","COOP","COOT","COPE","COPS","COPY","CORD","CORE","CORK","CORN",
                 "CORP","COST","COTS","COUP","COVE","COWL","COWS","COZY","CRAB","CRAG","CRAM","CRAN","CRAP","CRAW","CRED","CREW","CRIB",
                 "CRIT","CROC","CROP","CROW","CRUD","CRUX","CRYO","CUBE","CUBS","CUED","CUES","CUFF","CULL","CULT","CUPS","CURB","CURD",
                 "CURE","CURL","CURT","CUSP","CUSS","CUTE","CUTS","CYST","CZAR","DADS","DAFT","DAIS","DALE","DAME","DAMN","DAMP","DANG",
                 "DANK","DARE","DARK","DARN","DART","DASH","DATA","DATE","DAWN","DAYS","DAZE","DEAD","DEAF","DEAL","DEAN","DEAR","DEBT",
                 "DECK","DEED","DEEM","DEEP","DEER","DEFT","DEFY","DEJA","DELI","DELL","DELT","DEMO","DENS","DENT","DENY","DEPT","DERP",
                 "DESK","DEUX","DIAL","DIBS","DICE","DIED","DIES","DIET","DIGS","DIKE","DILL","DIME","DINE","DING","DINK","DINO","DINT",
                 "DIPS","DIRE","DIRT","DISC","DISH","DISK","DISS","DITZ","DIVA","DIVE","DOCK","DOCS","DODO","DOER","DOES","DOFF","DOGS",
                 "DOJO","DOLE","DOLL","DOLT","DOME","DONE","DONG","DONS","DONT","DOOF","DOOM","DOOR","DOPE","DORK","DORM","DOSE","DOTE",
                 "DOTH","DOTS","DOUR","DOVE","DOWN","DOZE","DRAB","DRAG","DRAT","DRAW","DREG","DREW","DRIP","DROP","DRUG","DRUM","DUAL",
                 "DUCK","DUCT","DUDE","DUDS","DUEL","DUES","DUET","DUFF","DUKE","DULL","DULY","DUMB","DUMP","DUNE","DUNG","DUNK","DUPE",
                 "DUSK","DUST","DUTY","DYAD","DYED","EACH","EARL","EARN","EARS","EASE","EAST","EASY","EATS","ECHO","ECRU","EDDY","EDGE",
                 "EDGY","EDIT","EELS","EGAD","EGGS","EGOS","ELKS","ELMS","ELSE","EMIT","ENDS","ENVY","EONS","EPEE","EPIC","ERGO","ETCH",
                 "EVEN","EVER","EVES","EVIL","EXAM","EXEC","EXES","EXIT","EXPO","EYED","EYES","FACE","FACT","FADE","FADS","FAIL","FAIR",
                 "FAKE","FALL","FAME","FANG","FANS","FARE","FARM","FART","FAST","FATE","FAUX","FAVE","FAWN","FAZE","FEAR","FEAT","FEED",
                 "FEEL","FEES","FEET","FELL","FELT","FEND","FERN","FEST","FETE","FEUD","FIAT","FIEF","FIFE","FIGS","FILE","FILL","FILM",
                 "FIND","FINE","FINK","FINS","FIRE","FIRM","FIRS","FISH","FIST","FITS","FIVE","FIZZ","FLAG","FLAK","FLAN","FLAP","FLAT",
                 "FLAW","FLAX","FLAY","FLEA","FLED","FLEE","FLEW","FLEX","FLIP","FLIT","FLOG","FLOP","FLOW","FLUE","FLUX","FLYS","FOAL",
                 "FOAM","FOES","FOIL","FOLD","FOLK","FOND","FONT","FOOD","FOOL","FOOT","FORD","FORE","FORK","FORM","FORT","FOUL","FOUR",
                 "FOWL","FOXY","FRAG","FRAT","FRAY","FREE","FRET","FROE","FROG","FROM","FUEL","FULL","FUME","FUND","FUNK","FURL","FURS",
                 "FURY","FUSE","FUSS","FUZE","FUZZ","GAFF","GAGA","GAGS","GAIN","GAIT","GALA","GALE","GALL","GALS","GAME","GAMY","GANG",
                 "GAPE","GAPS","GARB","GASH","GASP","GATE","GAVE","GAWK","GAYS","GAZE","GEAR","GEEK","GELD","GELS","GELT","GEMS","GENE",
                 "GENT","GERM","GETS","GIBE","GIFT","GIGS","GILD","GILL","GILT","GIMP","GINS","GIRD","GIRL","GIST","GIVE","GLAD","GLAM",
                 "GLEE","GLEN","GLIB","GLOP","GLOW","GLUE","GLUM","GLUT","GNAT","GNAW","GOAD","GOAL","GOAT","GOBS","GODS","GOER","GOES",
                 "GOGO","GOLD","GOLF","GONE","GONG","GOOD","GOOF","GOOK","GOON","GOOP","GORE","GORY","GOSH","GOTH","GOUT","GOWN","GRAB",
                 "GRAD","GRAM","GRAY","GREW","GREY","GRID","GRIM","GRIN","GRIP","GRIT","GROG","GROW","GRUB","GUFF","GULF","GULL","GULP",
                 "GUMS","GUNK","GUNS","GURU","GUSH","GUST","GUTS","GUYS","GYMS","GYRO","HACK","HAGS","HAHA","HAIL","HAIR","HALF","HALL",
                 "HALO","HALT","HAMS","HAND","HANG","HARD","HARE","HARK","HARM","HARP","HART","HASH","HATE","HATH","HATS","HAUL","HAVE",
                 "HAWK","HAZE","HAZY","HEAD","HEAL","HEAP","HEAR","HEAT","HECK","HEED","HEEL","HEFT","HEIR","HELD","HELL","HELM","HELP",
                 "HEMP","HENS","HERB","HERD","HERE","HERO","HERS","HICK","HIDE","HIGH","HIKE","HILL","HILT","HIMS","HIND","HINT","HIPS",
                 "HIRE","HISS","HITS","HIVE","HOAX","HOBO","HOCK","HOES","HOGS","HOHO","HOLD","HOLE","HOLY","HOME","HONE","HONK","HOOD",
                 "HOOF","HOOK","HOOP","HOOT","HOPE","HOPS","HORN","HOSE","HOST","HOTS","HOUR","HOVE","HOWL","HOWS","HUFF","HUGE","HUGS",
                 "HULA","HULK","HULL","HUMM","HUMP","HUMS","HUNG","HUNK","HUNT","HURL","HURT","HUSH","HUSK","HUTS","HYMN","HYPE","ICED",
                 "ICKY","ICON","IDEA","IDES","IDLE","IDLY","IDOL","IFFY","ILLS","INCH","INFO","INNS","INTO","IONS","IOTA","IRIS","IRON",
                 "ISLE","ISNT","ITCH","ITEM","ITSY","ITTY","JABS","JACK","JADE","JAGS","JAIL","JAMB","JAMS","JAPE","JARS","JAWS","JAYS",
                 "JAZZ","JEDI","JEEP","JEER","JEEZ","JERK","JEST","JETS","JIBE","JIGS","JILT","JINX","JIVE","JOBS","JOCK","JOEY","JOGS",
                 "JOHN","JOIN","JOKE","JOLT","JOWL","JOYS","JUDO","JUGS","JUJU","JUKE","JULY","JUMP","JUNE","JUNK","JURY","JUST","JUTS",
                 "KALE","KEEL","KEEN","KEEP","KEGS","KELP","KENO","KEPT","KERN","KEYS","KICK","KIDS","KILL","KILN","KILT","KIND","KING",
                 "KINK","KISS","KITE","KITS","KIWI","KNEE","KNEW","KNIT","KNOB","KNOT","KNOW","KOAN","KOOK","LABS","LACE","LACK","LACY",
                 "LADS","LADY","LAID","LAIN","LAIR","LAKE","LAMB","LAME","LAMP","LAND","LANE","LANK","LAPS","LARD","LARK","LASH","LASS",
                 "LAST","LATE","LAUD","LAVA","LAWN","LAWS","LAYS","LAZE","LAZY","LEAD","LEAF","LEAK","LEAN","LEAP","LEDE","LEEK","LEER",
                 "LEFT","LEGO","LEGS","LEND","LENS","LENT","LESS","LEST","LETS","LEVY","LEWD","LIAR","LICE","LICK","LIDS","LIED","LIEN",
                 "LIER","LIES","LIEU","LIFE","LIFT","LIKE","LILT","LILY","LIMB","LIME","LIMO","LIMP","LINE","LINK","LINT","LION","LIPS",
                 "LISP","LIST","LITE","LIVE","LOAD","LOAF","LOAM","LOAN","LOBE","LOCH","LOCK","LOCO","LODE","LOFT","LOGO","LOGS","LOIN",
                 "LONE","LONG","LOOK","LOOM","LOON","LOOP","LOOT","LOPE","LORD","LORE","LOSE","LOSS","LOST","LOTS","LOUD","LOUT","LOVE",
                 "LOWS","LUAU","LUBE","LUCK","LUGE","LULL","LUMP","LUNG","LURE","LURK","LUSH","LUST","LUTE","LUXE","LYNX","LYRE","MAAM",
                 "MACE","MACH","MADE","MAGE","MAGI","MAGS","MAID","MAIL","MAIM","MAIN","MAKE","MALE","MALL","MALT","MAME","MANE","MANY",
                 "MAPS","MARE","MARK","MARS","MART","MASH","MASK","MASS","MAST","MATE","MATH","MATS","MAUL","MAYO","MAYS","MAZE","MAZY",
                 "MEAD","MEAL","MEAN","MEAT","MEDS","MEEK","MEGA","MELT","MEME","MEMO","MEND","MENS","MENU","MEOW","MERE","MESA","MESH",
                 "MESS","META","METH","MICE","MILD","MILE","MILK","MILL","MIME","MIND","MINE","MINI","MINK","MINT","MIRE","MIRY","MISS",
                 "MIST","MITE","MITT","MOAN","MOAT","MOBS","MOCK","MODE","MOJO","MOLD","MOLE","MOLT","MOMS","MONK","MONO","MOOD","MOOK",
                 "MOON","MOOR","MOOT","MOPE","MOPS","MORE","MOSH","MOSS","MOST","MOTH","MOVE","MOWN","MUCH","MUCK","MUFF","MUGS","MULE",
                 "MULL","MUSE","MUSH","MUSK","MUST","MUTE","MUTT","MYTH","NAAN","NADA","NAGS","NAIL","NAME","NANO","NAPE","NAPS","NARC",
                 "NARY","NAVY","NEAR","NEAT","NECK","NEED","NEON","NERD","NEST","NETS","NEWS","NEWT","NEXT","NICE","NICK","NIGH","NINE",
                 "NIPS","NITE","NITS","NODE","NODS","NOES","NOIR","NONE","NOOK","NOON","NOPE","NORM","NOSE","NOSH","NOSY","NOTE","NOUN",
                 "NOVA","NUDE","NUKE","NULL","NUMB","NUNS","NUTS","OAKS","OARS","OATH","OATS","OBEY","OBIT","OBOE","ODDS","ODOR","OGLE",
                 "OGRE","OILS","OILY","OINK","OKAY","OKIE","OKRA","OLDE","OMEN","OMIT","ONCE","ONES","ONLY","ONTO","ONUS","ONYX","OOPS",
                 "OOZE","OPAL","OPEN","OPUS","ORAL","ORBS","ORCA","ORES","ORGY","OUCH","OURS","OUST","OUTS","OVAL","OVEN","OVER","OWED",
                 "OWES","OWLS","OWNS","OXEN","PACE","PACK","PACT","PADS","PAGE","PAID","PAIL","PAIN","PAIR","PALE","PALL","PALM","PALS",
                 "PANE","PANG","PANS","PANT","PAPA","PARE","PARK","PART","PASS","PAST","PATE","PATH","PATS","PAVE","PAWN","PAWS","PAYS",
                 "PEAK","PEAL","PEAR","PEAS","PEAT","PECK","PEEK","PEEL","PEEN","PEEP","PEER","PEGS","PELT","PEND","PENS","PENT","PEON",
                 "PERK","PERM","PERP","PERT","PERV","PEST","PETS","PFFT","PHEW","PICK","PIED","PIER","PIES","PIGS","PIKE","PILE","PILL",
                 "PINE","PING","PINK","PINS","PINT","PIPE","PIPS","PISS","PITH","PITS","PITY","PLAN","PLAY","PLEA","PLED","PLOD","PLOP",
                 "PLOT","PLOW","PLOY","PLUG","PLUM","PLUS","POCK","PODS","POEM","POET","POKE","POLE","POLL","POLO","POLY","POMP","POND",
                 "PONG","PONY","POOF","POOL","POOP","POOR","POPE","POPS","PORE","PORK","PORN","PORT","POSE","POSH","POST","POSY","POTS",
                 "POUR","POUT","PRAY","PREP","PREY","PRIM","PROD","PROM","PROP","PROS","PSST","PUCE","PUCK","PUFF","PUKE","PULL","PULP",
                 "PUMA","PUMP","PUNK","PUNS","PUNT","PUNY","PUPA","PURE","PURL","PURR","PUSH","PUSS","PUTS","PUTT","PUTZ","PYRE","PYRO",
                 "QUAD","QUAY","QUIP","QUIT","QUIZ","RACE","RACK","RACY","RAFF","RAFT","RAGE","RAGS","RAID","RAIL","RAIN","RAKE","RAMP",
                 "RAMS","RANG","RANK","RANT","RAPS","RAPT","RARE","RASH","RASP","RATE","RATS","RAVE","RAYS","RAZE","RAZZ","READ","REAL",
                 "REAM","REAP","REAR","RECK","REDO","REDS","REED","REEF","REEK","REEL","REIN","RELY","REND","RENT","REPS","REST","RIBS",
                 "RICE","RICH","RICK","RIDE","RIFE","RIFF","RIFT","RIGS","RILE","RIMS","RIND","RING","RINK","RIOT","RIPE","RIPS","RISE",
                 "RISK","RITE","RITZ","RIVE","ROAD","ROAM","ROAN","ROAR","ROBE","ROBS","ROCK","RODE","RODS","ROIL","ROLE","ROLF","ROLL",
                 "ROMP","ROOF","ROOK","ROOM","ROOT","ROPE","ROSE","ROSY","ROTS","ROUT","ROVE","ROWS","RUBE","RUBS","RUBY","RUDE","RUFF",
                 "RUGS","RUIN","RULE","RUMP","RUNE","RUNG","RUNS","RUNT","RUSE","RUSH","RUST","RUTS","SACK","SAFE","SAGA","SAGE","SAID",
                 "SAIL","SAKE","SALE","SALT","SAME","SAND","SANE","SANG","SANK","SANS","SAPS","SASH","SASS","SATE","SAVE","SAWS","SAYS",
                 "SCAB","SCAM","SCAN","SCAR","SCAT","SCUD","SCUM","SEAL","SEAM","SEAR","SEAS","SEAT","SECT","SEED","SEEK","SEEM","SEEN",
                 "SEEP","SEER","SEES","SELF","SELL","SEMI","SEND","SENT","SERF","SETS","SEWN","SEXY","SHAD","SHAG","SHAH","SHAM","SHED",
                 "SHES","SHIM","SHIN","SHIP","SHIV","SHOE","SHOO","SHOP","SHOT","SHOW","SHUN","SHUT","SICK","SIDE","SIFT","SIGH","SIGN",
                 "SILK","SILL","SILO","SILT","SINE","SING","SINK","SINS","SIPS","SIRE","SIRS","SITE","SITS","SIZE","SKEW","SKID","SKIM",
                 "SKIN","SKIP","SKIS","SKIT","SLAB","SLAM","SLAP","SLAT","SLAY","SLED","SLEW","SLID","SLIM","SLIP","SLIT","SLOB","SLOG",
                 "SLOP","SLOT","SLOW","SLUE","SLUG","SLUM","SLUR","SMOG","SMUG","SMUT","SNAG","SNAP","SNIP","SNIT","SNOB","SNOT","SNOW",
                 "SNUB","SNUG","SOAK","SOAP","SOAR","SOBS","SOCK","SODA","SOFA","SOFT","SOIL","SOLD","SOLE","SOLO","SOME","SONG","SONS",
                 "SOON","SOOT","SORE","SORT","SOSO","SOUL","SOUP","SOUR","SOWN","SPAM","SPAN","SPAR","SPAS","SPAT","SPAY","SPAZ","SPEC",
                 "SPED","SPEW","SPIN","SPIT","SPOT","SPRY","SPUD","SPUN","SPUR","STAB","STAG","STAR","STAT","STAY","STEM","STEP","STEW",
                 "STIR","STOP","STOW","STUB","STUD","STUN","STYE","SUBS","SUCH","SUCK","SUDS","SUED","SUES","SUIT","SULK","SUMO","SUMP",
                 "SUMS","SUNG","SUNK","SUNS","SURE","SURF","SUSS","SWAB","SWAG","SWAM","SWAN","SWAP","SWAT","SWAY","SWIG","SWIM","SWUM",
                 "SYNC","TABS","TACH","TACK","TACO","TACT","TADA","TAGS","TAIL","TAKE","TALC","TALE","TALK","TALL","TAME","TANG","TANK",
                 "TANS","TAPE","TAPS","TARE","TARP","TART","TASK","TAUT","TAXI","TEAK","TEAL","TEAM","TEAR","TEAS","TEAT","TECH","TEED",
                 "TEEM","TEEN","TEES","TELL","TEMP","TEND","TENS","TENT","TERM","TEST","TEXT","THAN","THAT","THAW","THEE","THEM","THEN",
                 "THEY","THIN","THIS","THOU","THRU","THUD","THUG","TICK","TIDE","TIDY","TIED","TIER","TIES","TIFF","TIKI","TILE","TILL",
                 "TILT","TIME","TINE","TING","TINK","TINS","TINT","TINY","TIPS","TIRE","TITS","TOAD","TOCK","TODO","TOED","TOES","TOFU",
                 "TOGA","TOIL","TOKE","TOLD","TOLL","TOMB","TOME","TONE","TONG","TONS","TOOK","TOOL","TOON","TOOT","TOPS","TORE","TORN",
                 "TORT","TOSS","TOTE","TOTS","TOUT","TOWN","TOYS","TRAM","TRAP","TRAY","TREE","TREK","TRIM","TRIO","TRIP","TROD","TROT",
                 "TRUE","TUBA","TUBE","TUBS","TUCK","TUFT","TUNA","TUNE","TURD","TURF","TURN","TUSK","TUTU","TWAS","TWEE","TWIG","TWIN",
                 "TWIT","TWOS","TYKE","TYPE","TYPO","UBER","UFOS","UGLY","UNDO","UNIT","UNTO","UPON","URGE","URNS","USED","USER","USES",
                 "VAIL","VAIN","VALE","VAMP","VANE","VANS","VARY","VASE","VAST","VATS","VEAL","VEEP","VEER","VEIL","VEIN","VEND","VENT",
                 "VERB","VERT","VERY","VEST","VETO","VETS","VIAL","VIBE","VICE","VIEW","VILE","VINE","VISA","VISE","VOID","VOLT","VOTE",
                 "VOWS","WACK","WADE","WAFT","WAGE","WAIF","WAIL","WAIT","WAKE","WALE","WALK","WALL","WAND","WANE","WANT","WARD","WARE",
                 "WARM","WARN","WARP","WARS","WART","WARY","WASH","WASP","WATT","WAVE","WAVY","WAXY","WAYS","WEAK","WEAN","WEAR","WEBS",
                 "WEDS","WEED","WEEK","WEEP","WELD","WELL","WELT","WENT","WEPT","WERE","WEST","WEST","WETS","WEVE","WHAM","WHAT","WHEE",
                 "WHEN","WHET","WHEW","WHEY","WHIM","WHIP","WHIZ","WHOA","WHOM","WHOP","WHYS","WICK","WIDE","WIFE","WIGS","WILD","WILE",
                 "WILL","WILT","WILY","WIMP","WIND","WINE","WING","WINK","WINS","WIPE","WIRE","WIRY","WISE","WISH","WISP","WITH","WITS",
                 "WOAH","WOES","WOKE","WOLF","WOMB","WONT","WOOD","WOOF","WOOL","WOOT","WORD","WORE","WORK","WORM","WORN","WOVE","WRAP",
                 "WREN","WRIT","WUSS","XRAY","YACK","YADA","YAKS","YALL","YAMS","YANG","YANK","YARD","YARN","YAWN","YEAH","YEAR","YELL",
                 "YELP","YETI","YIPE","YOGA","YOKE","YOLK","YORE","YOUR","YOWL","YUCK","YULE","YURT","ZANY","ZEAL","ZERO","ZEST","ZINC",
                 "ZING","ZION","ZITS","ZONE","ZOOM","ZOOS"};
                 public  void calculate(){
                     Random random=new Random();
                     n=random.nextInt(arr.length);
                     hideWords=arr[n];
                     System.out.println("the word"+ hideWords);
                     System.out.println("find the words onely 10");
                     for(int i=1;i<=10;i++){
                     Scanner scan=new Scanner(System.in);
                     System.out.println("options "+i+"Enter a four letter words");
                        words=scan.nextLine();
                        words=words.toUpperCase();
                        if(hideWords.equals(words)==true){
                            System.out.println("its correct 4alpha "+hideWords);
                            break;
                        }
                        else{
                             char[] c=words.toCharArray();
                             char[] m=hideWords.toCharArray();
                             int j;
                             for(j=0;j<4;j++){
                                String n=String.valueOf(c[j]);
                                if(hideWords.contains(n)){
                                    if(m[j]==c[j]){
                                        alpha++;
                                    }else{
                                        beta++;
                                        continue;
                                    }
                                }
                                else{
                                    continue;
                                }
                             }    
                        }
                     System.out.println(alpha+"alpha "+beta+" beta");
                     }
    }
}