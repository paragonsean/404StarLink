# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_price_point_relationships_territory import AppPricePointRelationshipsTerritory

class TestAppPricePointRelationshipsTerritory(unittest.TestCase):
    """AppPricePointRelationshipsTerritory unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppPricePointRelationshipsTerritory:
        """Test AppPricePointRelationshipsTerritory
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppPricePointRelationshipsTerritory`
        """
        model = AppPricePointRelationshipsTerritory()
        if include_optional:
            return AppPricePointRelationshipsTerritory(
                data = openapi_client.models.app_relationships_available_territories_data_inner.App_relationships_availableTerritories_data_inner(
                    id = '', 
                    type = 'territories', ),
                links = openapi_client.models.app_relationships_app_infos_links.App_relationships_appInfos_links(
                    related = '', 
                    self = '', )
            )
        else:
            return AppPricePointRelationshipsTerritory(
        )
        """

    def testAppPricePointRelationshipsTerritory(self):
        """Test AppPricePointRelationshipsTerritory"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
