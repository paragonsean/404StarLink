# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.user_update_content import UserUpdateContent

class TestUserUpdateContent(unittest.TestCase):
    """UserUpdateContent unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UserUpdateContent:
        """Test UserUpdateContent
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UserUpdateContent`
        """
        model = UserUpdateContent()
        if include_optional:
            return UserUpdateContent(
                city = '',
                country = '',
                phone = '',
                state = '',
                street = '',
                zip = '',
                birthday = datetime.datetime.strptime('1975-12-30', '%Y-%m-%d').date(),
                email = '',
                first_name = '',
                id = 56,
                last_name = '',
                notifications = openapi_client.models.user_update_content_all_of_notifications.UserUpdateContent_allOf_notifications(
                    phone_number = '', 
                    sms_enabled = True, ),
                notify = True,
                paypal_email = '',
                require_1099 = True,
                user_groups = [
                    56
                    ]
            )
        else:
            return UserUpdateContent(
        )
        """

    def testUserUpdateContent(self):
        """Test UserUpdateContent"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
