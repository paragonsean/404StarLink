# coding: utf-8

"""
    Mailscript

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 0.4.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.verification_sms import VerificationSms

class TestVerificationSms(unittest.TestCase):
    """VerificationSms unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> VerificationSms:
        """Test VerificationSms
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `VerificationSms`
        """
        model = VerificationSms()
        if include_optional:
            return VerificationSms(
                id = '',
                sms = '',
                type = 'sms',
                verified = True,
                verified_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                verified_by = ''
            )
        else:
            return VerificationSms(
        )
        """

    def testVerificationSms(self):
        """Test VerificationSms"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
