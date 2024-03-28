package lk.ijse.service.util;

import java.util.UUID;

/**
 * @author Dewmith Mihisara
 * @date 2024-03-28
 * @since 1.0.0
 */
public class UtilMatter {
    public static String generateID() {
        return UUID.randomUUID().toString();
    }
}
