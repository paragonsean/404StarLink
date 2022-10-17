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

from openapi_client.models.xavc_settings_xavc4k_profile_settings import XavcSettingsXavc4kProfileSettings

class TestXavcSettingsXavc4kProfileSettings(unittest.TestCase):
    """XavcSettingsXavc4kProfileSettings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> XavcSettingsXavc4kProfileSettings:
        """Test XavcSettingsXavc4kProfileSettings
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `XavcSettingsXavc4kProfileSettings`
        """
        model = XavcSettingsXavc4kProfileSettings()
        if include_optional:
            return XavcSettingsXavc4kProfileSettings(
                bitrate_class = None,
                codec_profile = None,
                flicker_adaptive_quantization = None,
                gop_b_reference = None,
                gop_closed_cadence = None,
                hrd_buffer_size = None,
                quality_tuning_level = None,
                slices = None
            )
        else:
            return XavcSettingsXavc4kProfileSettings(
        )
        """

    def testXavcSettingsXavc4kProfileSettings(self):
        """Test XavcSettingsXavc4kProfileSettings"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
