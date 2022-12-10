# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_info_response_included_inner import AppInfoResponseIncludedInner

class TestAppInfoResponseIncludedInner(unittest.TestCase):
    """AppInfoResponseIncludedInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppInfoResponseIncludedInner:
        """Test AppInfoResponseIncludedInner
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppInfoResponseIncludedInner`
        """
        model = AppInfoResponseIncludedInner()
        if include_optional:
            return AppInfoResponseIncludedInner(
                attributes = openapi_client.models.app_category_attributes.AppCategory_attributes(
                    platforms = [
                        'IOS'
                        ], ),
                id = '',
                links = openapi_client.models.resource_links.ResourceLinks(
                    self = '', ),
                relationships = openapi_client.models.app_category_relationships.AppCategory_relationships(
                    parent = openapi_client.models.app_category_relationships_parent.AppCategory_relationships_parent(
                        data = openapi_client.models.app_category_relationships_parent_data.AppCategory_relationships_parent_data(
                            id = '', 
                            type = 'appCategories', ), 
                        links = openapi_client.models.app_relationships_app_infos_links.App_relationships_appInfos_links(
                            related = '', 
                            self = '', ), ), 
                    subcategories = openapi_client.models.app_category_relationships_subcategories.AppCategory_relationships_subcategories(
                        meta = openapi_client.models.paging_information.PagingInformation(
                            paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                                limit = 56, 
                                total = 56, ), ), ), ),
                type = 'appInfoLocalizations'
            )
        else:
            return AppInfoResponseIncludedInner(
                id = '',
                links = openapi_client.models.resource_links.ResourceLinks(
                    self = '', ),
                type = 'appInfoLocalizations',
        )
        """

    def testAppInfoResponseIncludedInner(self):
        """Test AppInfoResponseIncludedInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
