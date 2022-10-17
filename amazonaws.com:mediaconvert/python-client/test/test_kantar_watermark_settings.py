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

from openapi_client.models.kantar_watermark_settings import KantarWatermarkSettings

class TestKantarWatermarkSettings(unittest.TestCase):
    """KantarWatermarkSettings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> KantarWatermarkSettings:
        """Test KantarWatermarkSettings
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `KantarWatermarkSettings`
        """
        model = KantarWatermarkSettings()
        if include_optional:
            return KantarWatermarkSettings(
                channel_name = None,
                content_reference = None,
                credentials_secret_name = None,
                file_offset = None,
                kantar_license_id = None,
                kantar_server_url = None,
                log_destination = None,
                metadata3 = None,
                metadata4 = None,
                metadata5 = None,
                metadata6 = None,
                metadata7 = None,
                metadata8 = None
            )
        else:
            return KantarWatermarkSettings(
        )
        """

    def testKantarWatermarkSettings(self):
        """Test KantarWatermarkSettings"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
