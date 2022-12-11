# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.profile_picture_upload import ProfilePictureUpload

class TestProfilePictureUpload(unittest.TestCase):
    """ProfilePictureUpload unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ProfilePictureUpload:
        """Test ProfilePictureUpload
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ProfilePictureUpload`
        """
        model = ProfilePictureUpload()
        if include_optional:
            return ProfilePictureUpload(
                profile_picture = bytes(b'blah')
            )
        else:
            return ProfilePictureUpload(
                profile_picture = bytes(b'blah'),
        )
        """

    def testProfilePictureUpload(self):
        """Test ProfilePictureUpload"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
