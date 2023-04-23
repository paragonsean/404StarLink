/*
 * IBM Containers API
 * Containers are virtual software objects that include all the elements that an app needs to run. A container has the benefits of resource isolation and allocation but is more portable and efficient than, for example, a virtual machine.   This documentation describes the IBM Containers API, which is based on the Docker Remote API. The API provides endpoints that you can use to create and manage your single containers and container groups in Bluemix. Endpoints are summarized under the following tags:   - **Authentication**: Retrieve and refresh your TLS certificates.  - **Private Docker images registry**: Create your own private Docker images registry in Bluemix by setting a namespace for your organization.  - **Images**: View, build, and push your images to your private Bluemix registry so you can use them with IBM Containers. You can also scan your container images with the Vulnerability Advisor against standard policies set by the organization manager and a database of known Ubuntu issues.  - **Single Containers**: Create and manage single containers in Bluemix. Use a single container to implement short-lived processes or to run simple tests as you develop an app or service. To make your single container available from the internet, review the `Public IP addresses` endpoints.  - **Container Groups**: Create and manage your container groups in Bluemix. A container group consists of multiple single containers that are all created from the same container image and as a consequence are configured in the same way. Container groups offer further options at no cost to make your app highly available. These options include in-built load balancing, auto-recovery of unhealthy container instances, and auto-scaling of container instances based on CPU and memory usage. Map a public route to your container group to make your app accessible from the internet.   - **Public IP addresses**: Use these endpoints to request public IP addresses for your space. You can bind this IP address to your container to make your container accessible from the internet.  - **File shares**: Create, list and delete file shares in a space. A file share is a NFS storage system that hosts Docker volumes.   - **Volumes**: Create and manage container volumes in your space to persist the data of your containers.      Each API request requires an HTTP header that includes the 'X-Auth-Token’ and 'X-Auth-Project-Id’ parameter.   - **X-Auth-Token**: The JSON web token (JWT) that you receive when logging into the Bluemix platform. It allows you to use the IBM Containers REST API, access services, and resources. Run `cf oauth-token` to retrieve your access token information. - **X-Auth-Project-Id**: The unique ID of your organization space where you want to create or work with your containers. Run `cf space <space_name> --guid`, where `<space_name>` is the name of your space, to retrieve your space ID.    For further information about how containers work in the IBM Containers service, review the documentation under https://new-console.ng.bluemix.net/docs/containers/container_index.html. 
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Namespace;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PrivateDockerImagesRegistryApi
 */
@Disabled
public class PrivateDockerImagesRegistryApiTest {

    private final PrivateDockerImagesRegistryApi api = new PrivateDockerImagesRegistryApi();

    /**
     * Retrieve the namespace of an organization.
     *
     * This endpoint retrieves the namespace that was set for the organization that owns the current space (corresponding IBM Containers command: &#x60;cf ic namespace get&#x60;).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registryNamespacesGetTest() throws ApiException {
        String xAuthToken = null;
        String xAuthProjectId = null;
        Namespace response = api.registryNamespacesGet(xAuthToken, xAuthProjectId);
        // TODO: test validations
    }

    /**
     * Check the availability of a namespace
     *
     * This endpoint checks whether a namespace is available in Bluemix and can be used to set up the private Docker images registry for an organization. When a HTTP code &#x60;201 Ok&#x60; is returned, the namespace is already assigned to another organization in Bluemix and cannot be used. When a HTTP code &#x60;404 Not found&#x60; is returned, the namespace can be used for your organization.    Consider the following rules when choosing a namespace for your organization:   - Every organization can have one namespace at a time only  - The namespace must be unique in Bluemix.  - The namespace can be 4-30 characters long.  - The namespace must start with at least one letter or number.  - The namespace can only contain lowercase letters, numbers or underscores (_). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registryNamespacesNamespaceGetTest() throws ApiException {
        String xAuthToken = null;
        String xAuthProjectId = null;
        String namespace = null;
        Namespace response = api.registryNamespacesNamespaceGet(xAuthToken, xAuthProjectId, namespace);
        // TODO: test validations
    }

    /**
     * Set a namespace for your private Bluemix registry.
     *
     * Set up your own Docker images registry in Bluemix by defining a namespace for your organization (corresponding IBM Containers command: &#x60;cf ic namespace set &lt;namespace&gt;&#x60;). The namespace is used to generate a unique URL to your private Bluemix registry. In your private registry you store all Docker images that you want to share across your organization. To create a container from an image, you must first push the image to your registry.    The namespace cannot be changed after is has been set. Consider the following rules to choose a namespace for your organization:   - Every organization can have one namespace at a time only  - The namespace must be unique in Bluemix.  - The namespace can be 4-30 characters long.  - The namespace must start with at least one letter or number.  - The namespace can only contain lowercase letters, numbers or underscores (_).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registryNamespacesNamespacePutTest() throws ApiException {
        String xAuthToken = null;
        String xAuthProjectId = null;
        String namespace = null;
        Namespace response = api.registryNamespacesNamespacePut(xAuthToken, xAuthProjectId, namespace);
        // TODO: test validations
    }

}
