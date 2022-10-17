# coding: utf-8

"""
    AWS Elemental MediaConvert

    AWS Elemental MediaConvert

    The version of the OpenAPI document: 2017-08-29
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.hls_encryption_settings import HlsEncryptionSettings

class TestHlsEncryptionSettings(unittest.TestCase):
    """HlsEncryptionSettings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> HlsEncryptionSettings:
        """Test HlsEncryptionSettings
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `HlsEncryptionSettings`
        """
        model = HlsEncryptionSettings()
        if include_optional:
            return HlsEncryptionSettings(
                constant_initialization_vector = None,
                encryption_method = None,
                initialization_vector_in_manifest = None,
                offline_encrypted = None,
                speke_key_provider = None,
                static_key_provider = None,
                type = None
            )
        else:
            return HlsEncryptionSettings(
        )
        """

    def testHlsEncryptionSettings(self):
        """Test HlsEncryptionSettings"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
