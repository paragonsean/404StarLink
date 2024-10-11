# coding: utf-8

"""
    Fitbit Plus API

    # Overview The Fitbit Plus API is a RESTful API. The requests and responses are formated according to the [JSON API](http://jsonapi.org/format/1.0/) specification.  In addition to this documentation, we also provide an [OpenAPI](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md) \"yaml\" file describing the API: [Fitbit Plus API Specification](swagger.yaml).  # Authentication Authentication for the Fitbit Plus API is based on the [OAuth 2.0 Authorization Framework](https://tools.ietf.org/html/rfc6749). Fitbit Plus currently supports grant types of **client_credentials** and **refresh_token**.  See [POST /oauth/token](#operation/createToken) for details on the request and response formats. <!-- ReDoc-Inject: <security-definitions> -->  ## Building Integrations We will provide customers with unique client credentials for each application/integration they build, allowing us to enforce appropriate access controls and monitor API usage. The client credentials will be scoped to the organization, and allow full access to all patients and related data within that organization.  These credentials are appropriate for creating an integration that does one of the following:  - background reporting/analysis  - synchronizing data with another system (such as an EMR)  The API credentials and oauth flows we currently support are **not** well suited for creating a user-facing application that allows a user (patient, coach, or admin) to login and have access to data which is appropriate to that specific user. It is possible to build such an application, but it is not possible to use Fitbit Plus as a federated identity provider. You would need to have a separate means of verifying a user's identity. We do not currently support the required password-based oauth flow to make this possible.  # Paging The Fitbit Plus API supports two different pagination strategies for GET collection endpoints.  #### Skip-based paging  Skip-based paging uses the query parameters `page[size]` and `page[number]` to specify the max number of resources returned and the page number. We default to skip-based paging if there are no page parameters. The response will include a `links` object containing links to the first, last, prev, and next pages of data.  If the contents of the collection change while you are iterating through the collection, you will see duplicate or missing documents. For example, if you are iterating through the `calender_event` resource via `GET /pub/calendar_event?sort=start_at&page[size]=50&page[number]=1`, and a new `calendar_event` is created that has a `start_at` value before the first `calendar_event`, when you fetch the next page at `GET /pub/calendar_event?sort=start_at&page[size]=50&page[number]=2`, the first entry in the second response will be a duplicate of the last entry in the first response.  #### Cursor-based paging Cursor-based paging uses the query parameters `page[limit]` and `page[after]` to specify the max number of entries returned and identify where to begin the next page. Add `page[limit]` to the parameters to use cursor-based paging. The response will include a `links` object containing a link to the next page of data, if the next page exists.  Cursor-based paging is not subject to duplication if new resources are added to the collection. For example, if you are iterating through the `calender_event` resource via `GET /pub/calendar_event?sort=start_at&page[limit]=50`, and a new `calendar_event` is created that has a `start_at` value before the first `calendar_event`, you will not see a duplicate entry when you fetch the next page at `GET /pub/calendar_event?sort=start_at&page[limit]=50&page[after]=<cursor>`.  We encourage the use of cursor-based paging for performance reasons.  In either form of paging, you can determine whether any resources were missed by comparing the number of fetched resources against `meta.count`. Set `page[size]` or `page[limit]` to 0 to get only the count.  It is not valid to mix the two strategies. 

    The version of the OpenAPI document: v7.78.1
    Contact: apiteam@twinehealth.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.fetch_bundle_response import FetchBundleResponse

class TestFetchBundleResponse(unittest.TestCase):
    """FetchBundleResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> FetchBundleResponse:
        """Test FetchBundleResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `FetchBundleResponse`
        """
        model = FetchBundleResponse()
        if include_optional:
            return FetchBundleResponse(
                data = openapi_client.models.bundle_resource.BundleResource(
                    attributes = openapi_client.models.bundle_resource_attributes.BundleResource_attributes(
                        _thread = '', 
                        effective_from = '', 
                        effective_to = '', 
                        title = '', 
                        type = '', ), 
                    id = '', 
                    relationships = openapi_client.models.bundle_resource_relationships.BundleResource_relationships(
                        actions = openapi_client.models.action_resource_relationships_plan.ActionResource_relationships_plan(
                            data = openapi_client.models.action_resource_relationships_plan_data.ActionResource_relationships_plan_data(
                                id = '', 
                                type = '', ), 
                            links = openapi_client.models.links.links(), ), 
                        plan = openapi_client.models.action_resource_relationships_plan.ActionResource_relationships_plan(
                            links = openapi_client.models.links.links(), ), ), 
                    type = '', ),
                meta = openapi_client.models.fetch_meta_response.FetchMetaResponse(
                    count = 56, 
                    req_id = '', )
            )
        else:
            return FetchBundleResponse(
                data = openapi_client.models.bundle_resource.BundleResource(
                    attributes = openapi_client.models.bundle_resource_attributes.BundleResource_attributes(
                        _thread = '', 
                        effective_from = '', 
                        effective_to = '', 
                        title = '', 
                        type = '', ), 
                    id = '', 
                    relationships = openapi_client.models.bundle_resource_relationships.BundleResource_relationships(
                        actions = openapi_client.models.action_resource_relationships_plan.ActionResource_relationships_plan(
                            data = openapi_client.models.action_resource_relationships_plan_data.ActionResource_relationships_plan_data(
                                id = '', 
                                type = '', ), 
                            links = openapi_client.models.links.links(), ), 
                        plan = openapi_client.models.action_resource_relationships_plan.ActionResource_relationships_plan(
                            links = openapi_client.models.links.links(), ), ), 
                    type = '', ),
        )
        """

    def testFetchBundleResponse(self):
        """Test FetchBundleResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
