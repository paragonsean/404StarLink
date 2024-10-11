# coding: utf-8

"""
    Mailscript

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 0.4.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.verifications_api import VerificationsApi


class TestVerificationsApi(unittest.TestCase):
    """VerificationsApi unit test stubs"""

    def setUp(self) -> None:
        self.api = VerificationsApi()

    def tearDown(self) -> None:
        pass

    def test_add_verification(self) -> None:
        """Test case for add_verification

        Start verification process for external email address or sms number
        """
        pass

    def test_get_all_verifications(self) -> None:
        """Test case for get_all_verifications

        Get all verificats for the user
        """
        pass

    def test_verify(self) -> None:
        """Test case for verify

        Verify an email address or sms number with a code
        """
        pass


if __name__ == '__main__':
    unittest.main()
