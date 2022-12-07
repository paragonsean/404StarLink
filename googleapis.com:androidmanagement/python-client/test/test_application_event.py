# coding: utf-8

"""
    Android Management API

    The Android Management API provides remote enterprise management of Android devices and apps.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.application_event import ApplicationEvent

class TestApplicationEvent(unittest.TestCase):
    """ApplicationEvent unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ApplicationEvent:
        """Test ApplicationEvent
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ApplicationEvent`
        """
        model = ApplicationEvent()
        if include_optional:
            return ApplicationEvent(
                create_time = '',
                event_type = 'APPLICATION_EVENT_TYPE_UNSPECIFIED'
            )
        else:
            return ApplicationEvent(
        )
        """

    def testApplicationEvent(self):
        """Test ApplicationEvent"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
