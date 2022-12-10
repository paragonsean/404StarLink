# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.beta_tester_create_request import BetaTesterCreateRequest

class TestBetaTesterCreateRequest(unittest.TestCase):
    """BetaTesterCreateRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BetaTesterCreateRequest:
        """Test BetaTesterCreateRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BetaTesterCreateRequest`
        """
        model = BetaTesterCreateRequest()
        if include_optional:
            return BetaTesterCreateRequest(
                data = openapi_client.models.beta_tester_create_request_data.BetaTesterCreateRequest_data(
                    attributes = openapi_client.models.beta_tester_create_request_data_attributes.BetaTesterCreateRequest_data_attributes(
                        email = '', 
                        first_name = '', 
                        last_name = '', ), 
                    relationships = openapi_client.models.beta_tester_create_request_data_relationships.BetaTesterCreateRequest_data_relationships(
                        beta_groups = openapi_client.models.beta_tester_create_request_data_relationships_beta_groups.BetaTesterCreateRequest_data_relationships_betaGroups(
                            data = [
                                openapi_client.models.app_relationships_beta_groups_data_inner.App_relationships_betaGroups_data_inner(
                                    id = '', 
                                    type = 'betaGroups', )
                                ], ), 
                        builds = openapi_client.models.beta_group_create_request_data_relationships_builds.BetaGroupCreateRequest_data_relationships_builds(), ), 
                    type = 'betaTesters', )
            )
        else:
            return BetaTesterCreateRequest(
                data = openapi_client.models.beta_tester_create_request_data.BetaTesterCreateRequest_data(
                    attributes = openapi_client.models.beta_tester_create_request_data_attributes.BetaTesterCreateRequest_data_attributes(
                        email = '', 
                        first_name = '', 
                        last_name = '', ), 
                    relationships = openapi_client.models.beta_tester_create_request_data_relationships.BetaTesterCreateRequest_data_relationships(
                        beta_groups = openapi_client.models.beta_tester_create_request_data_relationships_beta_groups.BetaTesterCreateRequest_data_relationships_betaGroups(
                            data = [
                                openapi_client.models.app_relationships_beta_groups_data_inner.App_relationships_betaGroups_data_inner(
                                    id = '', 
                                    type = 'betaGroups', )
                                ], ), 
                        builds = openapi_client.models.beta_group_create_request_data_relationships_builds.BetaGroupCreateRequest_data_relationships_builds(), ), 
                    type = 'betaTesters', ),
        )
        """

    def testBetaTesterCreateRequest(self):
        """Test BetaTesterCreateRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
