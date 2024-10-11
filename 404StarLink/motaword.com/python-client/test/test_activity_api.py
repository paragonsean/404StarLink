# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.activity_api import ActivityApi


class TestActivityApi(unittest.TestCase):
    """ActivityApi unit test stubs"""

    def setUp(self) -> None:
        self.api = ActivityApi()

    def tearDown(self) -> None:
        pass

    def test_get_activities(self) -> None:
        """Test case for get_activities

        Monitor project activities
        """
        pass

    def test_get_activity(self) -> None:
        """Test case for get_activity

        View an activity
        """
        pass

    def test_get_activity_comments(self) -> None:
        """Test case for get_activity_comments

        View activity comments
        """
        pass

    def test_get_comments(self) -> None:
        """Test case for get_comments

        View all project comments
        """
        pass

    def test_get_sales_activities(self) -> None:
        """Test case for get_sales_activities

        Get sales activities for a project
        """
        pass

    def test_insert_sales_activity(self) -> None:
        """Test case for insert_sales_activity

        Insert sales activity for a project
        """
        pass

    def test_submit_comment(self) -> None:
        """Test case for submit_comment

        Submit comment to an activity
        """
        pass


if __name__ == '__main__':
    unittest.main()
