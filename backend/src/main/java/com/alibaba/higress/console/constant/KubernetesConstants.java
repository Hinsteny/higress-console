package com.alibaba.higress.console.constant;

public class KubernetesConstants {

    public static final String MCP_BRIDGE_API_GROUP = "networking.higress.io";
    public static final String MCP_BRIDGE_KIND = "McpBridge";
    public static final String MCP_BRIDGE_NAME_DEFAULT = "default";

    public final static String K8S_API_VERSION_DEFAULT = "v1";
    public final static String K8S_CONFIGMAP = "ConfigMap";
    public final static String K8S_CERT = "cert";
    public final static String K8S_ENABLEHTTPS = "enableHttps";

    public static class Annotation {
        public static final String INGRESS_USE_REGEX_KEY = "higress.io/use-regex";
        public static final String INGRESS_USE_REGEX_TRUE_VALUE = "true";
        public static final String INGRESS_DESTINATION = "higress.io/destination";
    }

    public static class Label {
        public static final String DOMAIN_KEY_PREFIX = "higress.io/domain_";
        public static final String DOMAIN_VALUE_DUMMY = "true";
        public static final String RESOURCE_DEFINER_KEY = "higress.io/resource-definer";
        public static final String RESOURCE_DEFINER_VALUE = "higress";
    }

    public static class IngressPathType {
        public static final String EXACT = "Exact";
        public static final String PREFIX = "Prefix";
        public static final String IMPLEMENTATION_SPECIFIC = "ImplementationSpecific";
    }
}
