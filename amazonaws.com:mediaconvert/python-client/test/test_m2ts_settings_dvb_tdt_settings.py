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

from openapi_client.models.m2ts_settings_dvb_tdt_settings import M2tsSettingsDvbTdtSettings

class TestM2tsSettingsDvbTdtSettings(unittest.TestCase):
    """M2tsSettingsDvbTdtSettings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> M2tsSettingsDvbTdtSettings:
        """Test M2tsSettingsDvbTdtSettings
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `M2tsSettingsDvbTdtSettings`
        """
        model = M2tsSettingsDvbTdtSettings()
        if include_optional:
            return M2tsSettingsDvbTdtSettings(
                tdt_interval = None
            )
        else:
            return M2tsSettingsDvbTdtSettings(
        )
        """

    def testM2tsSettingsDvbTdtSettings(self):
        """Test M2tsSettingsDvbTdtSettings"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
