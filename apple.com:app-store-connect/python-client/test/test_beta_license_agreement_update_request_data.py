# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.beta_license_agreement_update_request_data import BetaLicenseAgreementUpdateRequestData

class TestBetaLicenseAgreementUpdateRequestData(unittest.TestCase):
    """BetaLicenseAgreementUpdateRequestData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BetaLicenseAgreementUpdateRequestData:
        """Test BetaLicenseAgreementUpdateRequestData
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BetaLicenseAgreementUpdateRequestData`
        """
        model = BetaLicenseAgreementUpdateRequestData()
        if include_optional:
            return BetaLicenseAgreementUpdateRequestData(
                attributes = openapi_client.models.beta_license_agreement_attributes.BetaLicenseAgreement_attributes(
                    agreement_text = '', ),
                id = '',
                type = 'betaLicenseAgreements'
            )
        else:
            return BetaLicenseAgreementUpdateRequestData(
                id = '',
                type = 'betaLicenseAgreements',
        )
        """

    def testBetaLicenseAgreementUpdateRequestData(self):
        """Test BetaLicenseAgreementUpdateRequestData"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
