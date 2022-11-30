# coding: utf-8

"""
    Soccer v3 Stats

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.player_season import PlayerSeason

class TestPlayerSeason(unittest.TestCase):
    """PlayerSeason unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PlayerSeason:
        """Test PlayerSeason
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PlayerSeason`
        """
        model = PlayerSeason()
        if include_optional:
            return PlayerSeason(
                assists = 1.337,
                blocked_shots = 1.337,
                corners_won = 1.337,
                crosses = 1.337,
                defender_clean_sheets = 1.337,
                fantasy_points = 1.337,
                fantasy_points_draft_kings = 1.337,
                fantasy_points_fan_duel = 1.337,
                fantasy_points_mondogoal = 1.337,
                fantasy_points_yahoo = 1.337,
                fouled = 1.337,
                fouls = 1.337,
                games = 56,
                global_team_id = 56,
                goalkeeper_clean_sheets = 1.337,
                goalkeeper_goals_against = 1.337,
                goalkeeper_saves = 1.337,
                goalkeeper_single_goal_against = 1.337,
                goalkeeper_wins = 1.337,
                goals = 1.337,
                interceptions = 1.337,
                last_man_tackle = 1.337,
                minutes = 1.337,
                name = '',
                offsides = 1.337,
                opponent_score = 1.337,
                own_goals = 1.337,
                passes = 1.337,
                passes_completed = 1.337,
                penalties_conceded = 1.337,
                penalties_won = 1.337,
                penalty_kick_goals = 1.337,
                penalty_kick_misses = 1.337,
                penalty_kick_saves = 1.337,
                player_id = 56,
                position = '',
                position_category = '',
                red_cards = 1.337,
                round_id = 56,
                score = 1.337,
                season = 56,
                season_type = 56,
                short_name = '',
                shots = 1.337,
                shots_on_goal = 1.337,
                started = 56,
                stat_id = 56,
                tackles = 1.337,
                tackles_won = 1.337,
                team = '',
                team_id = 56,
                touches = 1.337,
                updated = '',
                updated_utc = '',
                yellow_cards = 1.337,
                yellow_red_cards = 1.337
            )
        else:
            return PlayerSeason(
        )
        """

    def testPlayerSeason(self):
        """Test PlayerSeason"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
