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

from openapi_client.models.update_recommender_configuration import UpdateRecommenderConfiguration

class TestUpdateRecommenderConfiguration(unittest.TestCase):
    """UpdateRecommenderConfiguration unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdateRecommenderConfiguration:
        """Test UpdateRecommenderConfiguration
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdateRecommenderConfiguration`
        """
        model = UpdateRecommenderConfiguration()
        if include_optional:
            return UpdateRecommenderConfiguration(
                attributes = None,
                description = None,
                name = None,
                recommendation_provider_id_type = None,
                recommendation_provider_role_arn = None,
                recommendation_provider_uri = None,
                recommendation_transformer_uri = None,
                recommendations_display_name = None,
                recommendations_per_message = None
            )
        else:
            return UpdateRecommenderConfiguration(
                recommendation_provider_role_arn = None,
                recommendation_provider_uri = None,
        )
        """

    def testUpdateRecommenderConfiguration(self):
        """Test UpdateRecommenderConfiguration"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
