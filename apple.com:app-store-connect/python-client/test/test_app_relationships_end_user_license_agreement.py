# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_relationships_end_user_license_agreement import AppRelationshipsEndUserLicenseAgreement

class TestAppRelationshipsEndUserLicenseAgreement(unittest.TestCase):
    """AppRelationshipsEndUserLicenseAgreement unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppRelationshipsEndUserLicenseAgreement:
        """Test AppRelationshipsEndUserLicenseAgreement
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppRelationshipsEndUserLicenseAgreement`
        """
        model = AppRelationshipsEndUserLicenseAgreement()
        if include_optional:
            return AppRelationshipsEndUserLicenseAgreement(
                data = openapi_client.models.app_relationships_end_user_license_agreement_data.App_relationships_endUserLicenseAgreement_data(
                    id = '', 
                    type = 'endUserLicenseAgreements', ),
                links = openapi_client.models.app_relationships_app_infos_links.App_relationships_appInfos_links(
                    related = '', 
                    self = '', )
            )
        else:
            return AppRelationshipsEndUserLicenseAgreement(
        )
        """

    def testAppRelationshipsEndUserLicenseAgreement(self):
        """Test AppRelationshipsEndUserLicenseAgreement"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
