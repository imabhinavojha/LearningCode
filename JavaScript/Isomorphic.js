function areIsomorphic(s, t) {
    if (s.length !== t.length) {
        return false;
    }

    const sToTMapping = new Map();
    const tToSMapping = new Map();

    for (let i = 0; i < s.length; i++) {
        const charS = s[i];
        const charT = t[i];

        if (!sToTMapping.has(charS)) {
            sToTMapping.set(charS, charT);
        } else if (sToTMapping.get(charS) !== charT) {
            return false;
        }

        if (!tToSMapping.has(charT)) {
            tToSMapping.set(charT, charS);
        } else if (tToSMapping.get(charT) !== charS) {
            return false;
        }
    }

    return true;
}

const s1 = "egg";
const t1 = "add";

const s2 = "foo";
const t2 = "bar";

if (areIsomorphic(s1, t1)) {
    console.log("s1 and t1 are isomorphic.");
} else {
    console.log("s1 and t1 are not isomorphic.");
}

if (areIsomorphic(s2, t2)) {
    console.log("s2 and t2 are isomorphic.");
} else {
    console.log("s2 and t2 are not isomorphic.");
}
