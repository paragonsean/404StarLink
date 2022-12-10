# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.end_user_license_agreement import EndUserLicenseAgreement

class TestEndUserLicenseAgreement(unittest.TestCase):
    """EndUserLicenseAgreement unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> EndUserLicenseAgreement:
        """Test EndUserLicenseAgreement
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `EndUserLicenseAgreement`
        """
        model = EndUserLicenseAgreement()
        if include_optional:
            return EndUserLicenseAgreement(
                attributes = openapi_client.models.beta_license_agreement_attributes.BetaLicenseAgreement_attributes(
                    agreement_text = '', ),
                id = '',
                links = openapi_client.models.resource_links.ResourceLinks(
                    self = '', ),
                relationships = openapi_client.models.end_user_license_agreement_relationships.EndUserLicenseAgreement_relationships(
                    app = openapi_client.models.app_encryption_declaration_relationships_app.AppEncryptionDeclaration_relationships_app(
                        data = openapi_client.models.app_encryption_declaration_relationships_app_data.AppEncryptionDeclaration_relationships_app_data(
                            id = '', 
                            type = 'apps', ), 
                        links = openapi_client.models.app_relationships_app_infos_links.App_relationships_appInfos_links(
                            related = '', 
                            self = '', ), ), 
                    territories = openapi_client.models.app_relationships_available_territories.App_relationships_availableTerritories(
                        meta = openapi_client.models.paging_information.PagingInformation(
                            paging = openapi_client.models.paging_information_paging.PagingInformation_paging(
                                limit = 56, 
                                total = 56, ), ), ), ),
                type = 'endUserLicenseAgreements'
            )
        else:
            return EndUserLicenseAgreement(
                id = '',
                links = openapi_client.models.resource_links.ResourceLinks(
                    self = '', ),
                type = 'endUserLicenseAgreements',
        )
        """

    def testEndUserLicenseAgreement(self):
        """Test EndUserLicenseAgreement"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
