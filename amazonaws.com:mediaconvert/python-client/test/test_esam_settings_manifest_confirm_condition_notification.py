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

from openapi_client.models.esam_settings_manifest_confirm_condition_notification import EsamSettingsManifestConfirmConditionNotification

class TestEsamSettingsManifestConfirmConditionNotification(unittest.TestCase):
    """EsamSettingsManifestConfirmConditionNotification unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> EsamSettingsManifestConfirmConditionNotification:
        """Test EsamSettingsManifestConfirmConditionNotification
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `EsamSettingsManifestConfirmConditionNotification`
        """
        model = EsamSettingsManifestConfirmConditionNotification()
        if include_optional:
            return EsamSettingsManifestConfirmConditionNotification(
                mcc_xml = None
            )
        else:
            return EsamSettingsManifestConfirmConditionNotification(
        )
        """

    def testEsamSettingsManifestConfirmConditionNotification(self):
        """Test EsamSettingsManifestConfirmConditionNotification"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
