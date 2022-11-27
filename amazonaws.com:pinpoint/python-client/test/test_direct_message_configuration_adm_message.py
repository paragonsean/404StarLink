# coding: utf-8

"""
    Amazon Pinpoint

    Doc Engage API - Amazon Pinpoint API

    The version of the OpenAPI document: 2016-12-01
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.direct_message_configuration_adm_message import DirectMessageConfigurationADMMessage

class TestDirectMessageConfigurationADMMessage(unittest.TestCase):
    """DirectMessageConfigurationADMMessage unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DirectMessageConfigurationADMMessage:
        """Test DirectMessageConfigurationADMMessage
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DirectMessageConfigurationADMMessage`
        """
        model = DirectMessageConfigurationADMMessage()
        if include_optional:
            return DirectMessageConfigurationADMMessage(
                action = None,
                body = None,
                consolidation_key = None,
                data = None,
                expires_after = None,
                icon_reference = None,
                image_icon_url = None,
                image_url = None,
                md5 = None,
                raw_content = None,
                silent_push = None,
                small_image_icon_url = None,
                sound = None,
                substitutions = None,
                title = None,
                url = None
            )
        else:
            return DirectMessageConfigurationADMMessage(
        )
        """

    def testDirectMessageConfigurationADMMessage(self):
        """Test DirectMessageConfigurationADMMessage"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
