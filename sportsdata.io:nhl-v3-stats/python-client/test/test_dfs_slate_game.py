# coding: utf-8

"""
    NHL v3 Stats

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.dfs_slate_game import DfsSlateGame

class TestDfsSlateGame(unittest.TestCase):
    """DfsSlateGame unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DfsSlateGame:
        """Test DfsSlateGame
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DfsSlateGame`
        """
        model = DfsSlateGame()
        if include_optional:
            return DfsSlateGame(
                game = openapi_client.models.game.Game(
                    attendance = 56, 
                    away_rotation_number = 56, 
                    away_team = '', 
                    away_team_id = 56, 
                    away_team_money_line = 56, 
                    away_team_score = 56, 
                    channel = '', 
                    date_time = '', 
                    date_time_utc = '', 
                    day = '', 
                    game_end_date_time = '', 
                    game_id = 56, 
                    global_away_team_id = 56, 
                    global_game_id = 56, 
                    global_home_team_id = 56, 
                    home_rotation_number = 56, 
                    home_team = '', 
                    home_team_id = 56, 
                    home_team_money_line = 56, 
                    home_team_score = 56, 
                    is_closed = True, 
                    last_play = '', 
                    neutral_venue = True, 
                    over_payout = 56, 
                    over_under = 1.337, 
                    period = '', 
                    periods = [
                        openapi_client.models.period.Period(
                            away_score = 56, 
                            game_id = 56, 
                            home_score = 56, 
                            name = '', 
                            penalties = [
                                openapi_client.models.penalty.Penalty(
                                    bench_penalty_served_by_player_id = 56, 
                                    description = '', 
                                    drawn_by_player_id = 56, 
                                    drawn_by_team_id = 56, 
                                    is_bench_penalty = True, 
                                    penalized_player_id = 56, 
                                    penalized_team_id = 56, 
                                    penalty_id = 56, 
                                    penalty_minutes = 56, 
                                    period_id = 56, 
                                    sequence = 56, 
                                    time_remaining_minutes = 56, 
                                    time_remaining_seconds = 56, )
                                ], 
                            period_id = 56, 
                            scoring_plays = [
                                openapi_client.models.scoring_play.ScoringPlay(
                                    allowed_by_team_id = 56, 
                                    assisted_by_player_id1 = 56, 
                                    assisted_by_player_id2 = 56, 
                                    away_team_score = 56, 
                                    empty_net = True, 
                                    home_team_score = 56, 
                                    period_id = 56, 
                                    power_play = True, 
                                    scored_by_player_id = 56, 
                                    scored_by_team_id = 56, 
                                    scoring_play_id = 56, 
                                    sequence = 56, 
                                    short_handed = True, 
                                    time_remaining_minutes = 56, 
                                    time_remaining_seconds = 56, )
                                ], )
                        ], 
                    point_spread = 1.337, 
                    point_spread_away_team_money_line = 56, 
                    point_spread_home_team_money_line = 56, 
                    season = 56, 
                    season_type = 56, 
                    series_info = openapi_client.models.series.Series(
                        away_team_wins = 56, 
                        game_number = 56, 
                        home_team_wins = 56, 
                        max_length = 56, ), 
                    stadium_id = 56, 
                    status = '', 
                    time_remaining_minutes = 56, 
                    time_remaining_seconds = 56, 
                    under_payout = 56, 
                    updated = '', ),
                game_id = 56,
                operator_game_id = 56,
                removed_by_operator = True,
                slate_game_id = 56,
                slate_id = 56
            )
        else:
            return DfsSlateGame(
        )
        """

    def testDfsSlateGame(self):
        """Test DfsSlateGame"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
