# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_relationships_beta_app_localizations import AppRelationshipsBetaAppLocalizations

class TestAppRelationshipsBetaAppLocalizations(unittest.TestCase):
    """AppRelationshipsBetaAppLocalizations unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppRelationshipsBetaAppLocalizations:
        """Test AppRelationshipsBetaAppLocalizations
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppRelationshipsBetaAppLocalizations`
        """
        model = AppRelationshipsBetaAppLocalizations()
        if include_optional:
            return AppRelationshipsBetaAppLocalizations(
                data = [
                    openapi_client.models.app_relationships_beta_app_localizations_data_inner.App_relationships_betaAppLocalizations_data_inner(
                        id = '', 
                        type = 'betaAppLocalizations', )
                    ],
                links = openapi_client.models.app_relationships_app_infos_links.App_relationships_appInfos_links(
                    related = '', 
                    self = '', ),
                meta = openapi_client.models.paging_information.PagingInformation(
                    paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                        limit = 56, 
                        total = 56, ), )
            )
        else:
            return AppRelationshipsBetaAppLocalizations(
        )
        """

    def testAppRelationshipsBetaAppLocalizations(self):
        """Test AppRelationshipsBetaAppLocalizations"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
