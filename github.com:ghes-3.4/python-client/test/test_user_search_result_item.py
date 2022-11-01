# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.user_search_result_item import UserSearchResultItem

class TestUserSearchResultItem(unittest.TestCase):
    """UserSearchResultItem unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UserSearchResultItem:
        """Test UserSearchResultItem
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UserSearchResultItem`
        """
        model = UserSearchResultItem()
        if include_optional:
            return UserSearchResultItem(
                avatar_url = '',
                bio = '',
                blog = '',
                company = '',
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                email = '',
                events_url = '',
                followers = 56,
                followers_url = '',
                following = 56,
                following_url = '',
                gists_url = '',
                gravatar_id = '',
                hireable = True,
                html_url = '',
                id = 56,
                location = '',
                login = '',
                name = '',
                node_id = '',
                organizations_url = '',
                public_gists = 56,
                public_repos = 56,
                received_events_url = '',
                repos_url = '',
                score = 1.337,
                site_admin = True,
                starred_url = '',
                subscriptions_url = '',
                suspended_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                text_matches = [
                    openapi_client.models.search_result_text_matches_inner.search_result_text_matches_inner(
                        fragment = '', 
                        matches = [
                            openapi_client.models.search_result_text_matches_inner_matches_inner.search_result_text_matches_inner_matches_inner(
                                indices = [
                                    56
                                    ], 
                                text = '', )
                            ], 
                        object_type = '', 
                        object_url = '', 
                        property = '', )
                    ],
                type = '',
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                url = ''
            )
        else:
            return UserSearchResultItem(
                avatar_url = '',
                events_url = '',
                followers_url = '',
                following_url = '',
                gists_url = '',
                gravatar_id = '',
                html_url = '',
                id = 56,
                login = '',
                node_id = '',
                organizations_url = '',
                received_events_url = '',
                repos_url = '',
                score = 1.337,
                site_admin = True,
                starred_url = '',
                subscriptions_url = '',
                type = '',
                url = '',
        )
        """

    def testUserSearchResultItem(self):
        """Test UserSearchResultItem"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
