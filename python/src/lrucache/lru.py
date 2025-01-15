class LRUCache:
    def __init__(self, capacity):
        self.capacity = capacity
        self.cache = [] # to maintain order of keys (new -> old)
        self.lru = {} # to store key-value pairs for fast lookup

    def refer(self, key):
        # not present in cache
        if key not in self.lru:
            # cache is full
            if len(self.cache) == self.capacity:
                # remove least recently used element
                lru_key = self.cache.pop()
                del self.lru[lru_key]
            # add key to cache
            self.cache.insert(0, key)
        # present in cache
        else:
            # move the key to the front of cache (most recent)
            self.cache.remove(key)
            self.cache.insert(0, key)
       
        # update reference
        self.lru[key] = True

    def display(self):
        for i in self.cache:
            print(i,end=' ')
        print('')
