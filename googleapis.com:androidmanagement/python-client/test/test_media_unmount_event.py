# coding: utf-8

"""
    Android Management API

    The Android Management API provides remote enterprise management of Android devices and apps.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.media_unmount_event import MediaUnmountEvent

class TestMediaUnmountEvent(unittest.TestCase):
    """MediaUnmountEvent unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MediaUnmountEvent:
        """Test MediaUnmountEvent
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MediaUnmountEvent`
        """
        model = MediaUnmountEvent()
        if include_optional:
            return MediaUnmountEvent(
                mount_point = '',
                volume_label = ''
            )
        else:
            return MediaUnmountEvent(
        )
        """

    def testMediaUnmountEvent(self):
        """Test MediaUnmountEvent"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
