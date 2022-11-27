# coding: utf-8

"""
    Amazon Pinpoint

    Doc Engage API - Amazon Pinpoint API

    The version of the OpenAPI document: 2016-12-01
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.create_recommender_configuration_response import CreateRecommenderConfigurationResponse

class TestCreateRecommenderConfigurationResponse(unittest.TestCase):
    """CreateRecommenderConfigurationResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateRecommenderConfigurationResponse:
        """Test CreateRecommenderConfigurationResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateRecommenderConfigurationResponse`
        """
        model = CreateRecommenderConfigurationResponse()
        if include_optional:
            return CreateRecommenderConfigurationResponse(
                recommender_configuration_response = openapi_client.models.recommender_configuration_response.RecommenderConfigurationResponse(
                    attributes = null, 
                    creation_date = null, 
                    description = null, 
                    id = null, 
                    last_modified_date = null, 
                    name = null, 
                    recommendation_provider_id_type = null, 
                    recommendation_provider_role_arn = null, 
                    recommendation_provider_uri = null, 
                    recommendation_transformer_uri = null, 
                    recommendations_display_name = null, 
                    recommendations_per_message = null, )
            )
        else:
            return CreateRecommenderConfigurationResponse(
                recommender_configuration_response = openapi_client.models.recommender_configuration_response.RecommenderConfigurationResponse(
                    attributes = null, 
                    creation_date = null, 
                    description = null, 
                    id = null, 
                    last_modified_date = null, 
                    name = null, 
                    recommendation_provider_id_type = null, 
                    recommendation_provider_role_arn = null, 
                    recommendation_provider_uri = null, 
                    recommendation_transformer_uri = null, 
                    recommendations_display_name = null, 
                    recommendations_per_message = null, ),
        )
        """

    def testCreateRecommenderConfigurationResponse(self):
        """Test CreateRecommenderConfigurationResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
