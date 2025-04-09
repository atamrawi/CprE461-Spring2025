/**
 * A singleton class that caches configuration data for different enhancements.
 * It uses a map to store the configuration data associated with each enhancement ID.
 * The class provides methods to set and get the configuration data.
 * It ensures that only one instance of the cache exists throughout the application.
 */
public class AppCache {

    /**
     * Singleton instance of AppCache.
     * This ensures that only one instance of the cache exists throughout the application.
     * The instance is created lazily when it is first requested.
     */
    private static AppCache INSTANCE;

    /**
     * A map that stores configuration data for different enhancements.
     * The key is the enhancement ID, and the value is the configuration data.
     * This allows for quick retrieval of configuration data based on the enhancement ID.
     * <p>
     * The map is initialized in the constructor of the AppCache class.
     */
    private Map<EnhancementId, ConfigurationData> cache;

    /**
     * Private constructor to prevent instantiation from outside the class.
     */
    private AppCache() {
        cache = new HashMap<EnhancementId, ConfigurationData>();
    }

    /**
     * Returns the singleton instance of AppCache.
     * If the instance is null, it creates a new instance.
     * 
     * @return The singleton instance of AppCache.
     */
    public static AppCache getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AppCache();
        }
        return INSTANCE;
    }

    /**
     * Sets the configuration data for a given enhancement ID.
     * @param enhancementId The enhancement ID for which the configuration data is being set.
     * @param configData The configuration data to be set for the enhancement ID.
     */
    public void set(EnhancementId enhancementId, ConfigurationData configData) {
        this.cache.put(enhancementId, configData);
    }

    /**
     * Retrieves the configuration data for a given enhancement ID.
     * If the enhancement ID is not found in the cache, it returns null.
     * 
     * @param enhancementId The enhancement ID for which the configuration data is being retrieved.
     * @return The configuration data associated with the enhancement ID, or null if not found.
     */
    public ConfigurationData get(EnhancementId enhancementId) {
        return this.cache.get(enhancementId);
    }
    
}