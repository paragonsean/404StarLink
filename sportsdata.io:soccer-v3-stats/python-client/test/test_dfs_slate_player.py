# coding: utf-8

"""
    Soccer v3 Stats

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.dfs_slate_player import DfsSlatePlayer

class TestDfsSlatePlayer(unittest.TestCase):
    """DfsSlatePlayer unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DfsSlatePlayer:
        """Test DfsSlatePlayer
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DfsSlatePlayer`
        """
        model = DfsSlatePlayer()
        if include_optional:
            return DfsSlatePlayer(
                operator_player_id = '',
                operator_player_name = '',
                operator_position = '',
                operator_roster_slots = [
                    ''
                    ],
                operator_salary = 56,
                operator_slate_player_id = '',
                player_game_projection_stat_id = 56,
                player_id = 56,
                removed_by_operator = True,
                slate_game_id = 56,
                slate_id = 56,
                slate_player_id = 56,
                team = '',
                team_id = 56
            )
        else:
            return DfsSlatePlayer(
        )
        """

    def testDfsSlatePlayer(self):
        """Test DfsSlatePlayer"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
