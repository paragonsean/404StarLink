# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.users_api import UsersApi


class TestUsersApi(unittest.TestCase):
    """UsersApi unit test stubs"""

    def setUp(self) -> None:
        self.api = UsersApi()

    def tearDown(self) -> None:
        pass

    def test_users_delete_instance(self) -> None:
        """Test case for users_delete_instance

        """
        pass

    def test_users_get_collection(self) -> None:
        """Test case for users_get_collection

        """
        pass

    def test_users_get_instance(self) -> None:
        """Test case for users_get_instance

        """
        pass

    def test_users_update_instance(self) -> None:
        """Test case for users_update_instance

        """
        pass

    def test_users_visible_apps_create_to_many_relationship(self) -> None:
        """Test case for users_visible_apps_create_to_many_relationship

        """
        pass

    def test_users_visible_apps_delete_to_many_relationship(self) -> None:
        """Test case for users_visible_apps_delete_to_many_relationship

        """
        pass

    def test_users_visible_apps_get_to_many_related(self) -> None:
        """Test case for users_visible_apps_get_to_many_related

        """
        pass

    def test_users_visible_apps_get_to_many_relationship(self) -> None:
        """Test case for users_visible_apps_get_to_many_relationship

        """
        pass

    def test_users_visible_apps_replace_to_many_relationship(self) -> None:
        """Test case for users_visible_apps_replace_to_many_relationship

        """
        pass


if __name__ == '__main__':
    unittest.main()
