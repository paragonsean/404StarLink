# coding: utf-8

"""
    Soccer v3 Stats

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing import Optional, Set
from typing_extensions import Self

class TeamGame(BaseModel):
    """
    TeamGame
    """ # noqa: E501
    assists: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="Assists")
    blocked_shots: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="BlockedShots")
    corners_won: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="CornersWon")
    crosses: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="Crosses")
    date_time: Optional[StrictStr] = Field(default=None, alias="DateTime")
    day: Optional[StrictStr] = Field(default=None, alias="Day")
    defender_clean_sheets: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="DefenderCleanSheets")
    fantasy_points: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="FantasyPoints")
    fantasy_points_draft_kings: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="FantasyPointsDraftKings")
    fantasy_points_fan_duel: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="FantasyPointsFanDuel")
    fantasy_points_mondogoal: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="FantasyPointsMondogoal")
    fantasy_points_yahoo: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="FantasyPointsYahoo")
    fouled: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="Fouled")
    fouls: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="Fouls")
    game_id: Optional[StrictInt] = Field(default=None, alias="GameId")
    games: Optional[StrictInt] = Field(default=None, alias="Games")
    global_game_id: Optional[StrictInt] = Field(default=None, alias="GlobalGameId")
    global_opponent_id: Optional[StrictInt] = Field(default=None, alias="GlobalOpponentId")
    global_team_id: Optional[StrictInt] = Field(default=None, alias="GlobalTeamId")
    goalkeeper_clean_sheets: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="GoalkeeperCleanSheets")
    goalkeeper_goals_against: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="GoalkeeperGoalsAgainst")
    goalkeeper_saves: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="GoalkeeperSaves")
    goalkeeper_single_goal_against: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="GoalkeeperSingleGoalAgainst")
    goalkeeper_wins: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="GoalkeeperWins")
    goals: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="Goals")
    home_or_away: Optional[StrictStr] = Field(default=None, alias="HomeOrAway")
    interceptions: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="Interceptions")
    is_game_over: Optional[StrictBool] = Field(default=None, alias="IsGameOver")
    last_man_tackle: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="LastManTackle")
    minutes: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="Minutes")
    name: Optional[StrictStr] = Field(default=None, alias="Name")
    offsides: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="Offsides")
    opponent: Optional[StrictStr] = Field(default=None, alias="Opponent")
    opponent_id: Optional[StrictInt] = Field(default=None, alias="OpponentId")
    opponent_score: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="OpponentScore")
    own_goals: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="OwnGoals")
    passes: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="Passes")
    passes_completed: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="PassesCompleted")
    penalties_conceded: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="PenaltiesConceded")
    penalties_won: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="PenaltiesWon")
    penalty_kick_goals: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="PenaltyKickGoals")
    penalty_kick_misses: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="PenaltyKickMisses")
    penalty_kick_saves: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="PenaltyKickSaves")
    possession: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="Possession")
    red_cards: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="RedCards")
    round_id: Optional[StrictInt] = Field(default=None, alias="RoundId")
    score: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="Score")
    season: Optional[StrictInt] = Field(default=None, alias="Season")
    season_type: Optional[StrictInt] = Field(default=None, alias="SeasonType")
    shots: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="Shots")
    shots_on_goal: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="ShotsOnGoal")
    stat_id: Optional[StrictInt] = Field(default=None, alias="StatId")
    tackles: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="Tackles")
    tackles_won: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="TacklesWon")
    team: Optional[StrictStr] = Field(default=None, alias="Team")
    team_id: Optional[StrictInt] = Field(default=None, alias="TeamId")
    touches: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="Touches")
    updated: Optional[StrictStr] = Field(default=None, alias="Updated")
    updated_utc: Optional[StrictStr] = Field(default=None, alias="UpdatedUtc")
    yellow_cards: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="YellowCards")
    yellow_red_cards: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="YellowRedCards")
    __properties: ClassVar[List[str]] = ["Assists", "BlockedShots", "CornersWon", "Crosses", "DateTime", "Day", "DefenderCleanSheets", "FantasyPoints", "FantasyPointsDraftKings", "FantasyPointsFanDuel", "FantasyPointsMondogoal", "FantasyPointsYahoo", "Fouled", "Fouls", "GameId", "Games", "GlobalGameId", "GlobalOpponentId", "GlobalTeamId", "GoalkeeperCleanSheets", "GoalkeeperGoalsAgainst", "GoalkeeperSaves", "GoalkeeperSingleGoalAgainst", "GoalkeeperWins", "Goals", "HomeOrAway", "Interceptions", "IsGameOver", "LastManTackle", "Minutes", "Name", "Offsides", "Opponent", "OpponentId", "OpponentScore", "OwnGoals", "Passes", "PassesCompleted", "PenaltiesConceded", "PenaltiesWon", "PenaltyKickGoals", "PenaltyKickMisses", "PenaltyKickSaves", "Possession", "RedCards", "RoundId", "Score", "Season", "SeasonType", "Shots", "ShotsOnGoal", "StatId", "Tackles", "TacklesWon", "Team", "TeamId", "Touches", "Updated", "UpdatedUtc", "YellowCards", "YellowRedCards"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of TeamGame from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # set to None if assists (nullable) is None
        # and model_fields_set contains the field
        if self.assists is None and "assists" in self.model_fields_set:
            _dict['Assists'] = None

        # set to None if blocked_shots (nullable) is None
        # and model_fields_set contains the field
        if self.blocked_shots is None and "blocked_shots" in self.model_fields_set:
            _dict['BlockedShots'] = None

        # set to None if corners_won (nullable) is None
        # and model_fields_set contains the field
        if self.corners_won is None and "corners_won" in self.model_fields_set:
            _dict['CornersWon'] = None

        # set to None if crosses (nullable) is None
        # and model_fields_set contains the field
        if self.crosses is None and "crosses" in self.model_fields_set:
            _dict['Crosses'] = None

        # set to None if date_time (nullable) is None
        # and model_fields_set contains the field
        if self.date_time is None and "date_time" in self.model_fields_set:
            _dict['DateTime'] = None

        # set to None if day (nullable) is None
        # and model_fields_set contains the field
        if self.day is None and "day" in self.model_fields_set:
            _dict['Day'] = None

        # set to None if defender_clean_sheets (nullable) is None
        # and model_fields_set contains the field
        if self.defender_clean_sheets is None and "defender_clean_sheets" in self.model_fields_set:
            _dict['DefenderCleanSheets'] = None

        # set to None if fantasy_points (nullable) is None
        # and model_fields_set contains the field
        if self.fantasy_points is None and "fantasy_points" in self.model_fields_set:
            _dict['FantasyPoints'] = None

        # set to None if fantasy_points_draft_kings (nullable) is None
        # and model_fields_set contains the field
        if self.fantasy_points_draft_kings is None and "fantasy_points_draft_kings" in self.model_fields_set:
            _dict['FantasyPointsDraftKings'] = None

        # set to None if fantasy_points_fan_duel (nullable) is None
        # and model_fields_set contains the field
        if self.fantasy_points_fan_duel is None and "fantasy_points_fan_duel" in self.model_fields_set:
            _dict['FantasyPointsFanDuel'] = None

        # set to None if fantasy_points_mondogoal (nullable) is None
        # and model_fields_set contains the field
        if self.fantasy_points_mondogoal is None and "fantasy_points_mondogoal" in self.model_fields_set:
            _dict['FantasyPointsMondogoal'] = None

        # set to None if fantasy_points_yahoo (nullable) is None
        # and model_fields_set contains the field
        if self.fantasy_points_yahoo is None and "fantasy_points_yahoo" in self.model_fields_set:
            _dict['FantasyPointsYahoo'] = None

        # set to None if fouled (nullable) is None
        # and model_fields_set contains the field
        if self.fouled is None and "fouled" in self.model_fields_set:
            _dict['Fouled'] = None

        # set to None if fouls (nullable) is None
        # and model_fields_set contains the field
        if self.fouls is None and "fouls" in self.model_fields_set:
            _dict['Fouls'] = None

        # set to None if game_id (nullable) is None
        # and model_fields_set contains the field
        if self.game_id is None and "game_id" in self.model_fields_set:
            _dict['GameId'] = None

        # set to None if games (nullable) is None
        # and model_fields_set contains the field
        if self.games is None and "games" in self.model_fields_set:
            _dict['Games'] = None

        # set to None if global_game_id (nullable) is None
        # and model_fields_set contains the field
        if self.global_game_id is None and "global_game_id" in self.model_fields_set:
            _dict['GlobalGameId'] = None

        # set to None if global_opponent_id (nullable) is None
        # and model_fields_set contains the field
        if self.global_opponent_id is None and "global_opponent_id" in self.model_fields_set:
            _dict['GlobalOpponentId'] = None

        # set to None if global_team_id (nullable) is None
        # and model_fields_set contains the field
        if self.global_team_id is None and "global_team_id" in self.model_fields_set:
            _dict['GlobalTeamId'] = None

        # set to None if goalkeeper_clean_sheets (nullable) is None
        # and model_fields_set contains the field
        if self.goalkeeper_clean_sheets is None and "goalkeeper_clean_sheets" in self.model_fields_set:
            _dict['GoalkeeperCleanSheets'] = None

        # set to None if goalkeeper_goals_against (nullable) is None
        # and model_fields_set contains the field
        if self.goalkeeper_goals_against is None and "goalkeeper_goals_against" in self.model_fields_set:
            _dict['GoalkeeperGoalsAgainst'] = None

        # set to None if goalkeeper_saves (nullable) is None
        # and model_fields_set contains the field
        if self.goalkeeper_saves is None and "goalkeeper_saves" in self.model_fields_set:
            _dict['GoalkeeperSaves'] = None

        # set to None if goalkeeper_single_goal_against (nullable) is None
        # and model_fields_set contains the field
        if self.goalkeeper_single_goal_against is None and "goalkeeper_single_goal_against" in self.model_fields_set:
            _dict['GoalkeeperSingleGoalAgainst'] = None

        # set to None if goalkeeper_wins (nullable) is None
        # and model_fields_set contains the field
        if self.goalkeeper_wins is None and "goalkeeper_wins" in self.model_fields_set:
            _dict['GoalkeeperWins'] = None

        # set to None if goals (nullable) is None
        # and model_fields_set contains the field
        if self.goals is None and "goals" in self.model_fields_set:
            _dict['Goals'] = None

        # set to None if home_or_away (nullable) is None
        # and model_fields_set contains the field
        if self.home_or_away is None and "home_or_away" in self.model_fields_set:
            _dict['HomeOrAway'] = None

        # set to None if interceptions (nullable) is None
        # and model_fields_set contains the field
        if self.interceptions is None and "interceptions" in self.model_fields_set:
            _dict['Interceptions'] = None

        # set to None if last_man_tackle (nullable) is None
        # and model_fields_set contains the field
        if self.last_man_tackle is None and "last_man_tackle" in self.model_fields_set:
            _dict['LastManTackle'] = None

        # set to None if minutes (nullable) is None
        # and model_fields_set contains the field
        if self.minutes is None and "minutes" in self.model_fields_set:
            _dict['Minutes'] = None

        # set to None if name (nullable) is None
        # and model_fields_set contains the field
        if self.name is None and "name" in self.model_fields_set:
            _dict['Name'] = None

        # set to None if offsides (nullable) is None
        # and model_fields_set contains the field
        if self.offsides is None and "offsides" in self.model_fields_set:
            _dict['Offsides'] = None

        # set to None if opponent (nullable) is None
        # and model_fields_set contains the field
        if self.opponent is None and "opponent" in self.model_fields_set:
            _dict['Opponent'] = None

        # set to None if opponent_id (nullable) is None
        # and model_fields_set contains the field
        if self.opponent_id is None and "opponent_id" in self.model_fields_set:
            _dict['OpponentId'] = None

        # set to None if opponent_score (nullable) is None
        # and model_fields_set contains the field
        if self.opponent_score is None and "opponent_score" in self.model_fields_set:
            _dict['OpponentScore'] = None

        # set to None if own_goals (nullable) is None
        # and model_fields_set contains the field
        if self.own_goals is None and "own_goals" in self.model_fields_set:
            _dict['OwnGoals'] = None

        # set to None if passes (nullable) is None
        # and model_fields_set contains the field
        if self.passes is None and "passes" in self.model_fields_set:
            _dict['Passes'] = None

        # set to None if passes_completed (nullable) is None
        # and model_fields_set contains the field
        if self.passes_completed is None and "passes_completed" in self.model_fields_set:
            _dict['PassesCompleted'] = None

        # set to None if penalties_conceded (nullable) is None
        # and model_fields_set contains the field
        if self.penalties_conceded is None and "penalties_conceded" in self.model_fields_set:
            _dict['PenaltiesConceded'] = None

        # set to None if penalties_won (nullable) is None
        # and model_fields_set contains the field
        if self.penalties_won is None and "penalties_won" in self.model_fields_set:
            _dict['PenaltiesWon'] = None

        # set to None if penalty_kick_goals (nullable) is None
        # and model_fields_set contains the field
        if self.penalty_kick_goals is None and "penalty_kick_goals" in self.model_fields_set:
            _dict['PenaltyKickGoals'] = None

        # set to None if penalty_kick_misses (nullable) is None
        # and model_fields_set contains the field
        if self.penalty_kick_misses is None and "penalty_kick_misses" in self.model_fields_set:
            _dict['PenaltyKickMisses'] = None

        # set to None if penalty_kick_saves (nullable) is None
        # and model_fields_set contains the field
        if self.penalty_kick_saves is None and "penalty_kick_saves" in self.model_fields_set:
            _dict['PenaltyKickSaves'] = None

        # set to None if possession (nullable) is None
        # and model_fields_set contains the field
        if self.possession is None and "possession" in self.model_fields_set:
            _dict['Possession'] = None

        # set to None if red_cards (nullable) is None
        # and model_fields_set contains the field
        if self.red_cards is None and "red_cards" in self.model_fields_set:
            _dict['RedCards'] = None

        # set to None if round_id (nullable) is None
        # and model_fields_set contains the field
        if self.round_id is None and "round_id" in self.model_fields_set:
            _dict['RoundId'] = None

        # set to None if score (nullable) is None
        # and model_fields_set contains the field
        if self.score is None and "score" in self.model_fields_set:
            _dict['Score'] = None

        # set to None if shots (nullable) is None
        # and model_fields_set contains the field
        if self.shots is None and "shots" in self.model_fields_set:
            _dict['Shots'] = None

        # set to None if shots_on_goal (nullable) is None
        # and model_fields_set contains the field
        if self.shots_on_goal is None and "shots_on_goal" in self.model_fields_set:
            _dict['ShotsOnGoal'] = None

        # set to None if tackles (nullable) is None
        # and model_fields_set contains the field
        if self.tackles is None and "tackles" in self.model_fields_set:
            _dict['Tackles'] = None

        # set to None if tackles_won (nullable) is None
        # and model_fields_set contains the field
        if self.tackles_won is None and "tackles_won" in self.model_fields_set:
            _dict['TacklesWon'] = None

        # set to None if team (nullable) is None
        # and model_fields_set contains the field
        if self.team is None and "team" in self.model_fields_set:
            _dict['Team'] = None

        # set to None if team_id (nullable) is None
        # and model_fields_set contains the field
        if self.team_id is None and "team_id" in self.model_fields_set:
            _dict['TeamId'] = None

        # set to None if touches (nullable) is None
        # and model_fields_set contains the field
        if self.touches is None and "touches" in self.model_fields_set:
            _dict['Touches'] = None

        # set to None if updated (nullable) is None
        # and model_fields_set contains the field
        if self.updated is None and "updated" in self.model_fields_set:
            _dict['Updated'] = None

        # set to None if updated_utc (nullable) is None
        # and model_fields_set contains the field
        if self.updated_utc is None and "updated_utc" in self.model_fields_set:
            _dict['UpdatedUtc'] = None

        # set to None if yellow_cards (nullable) is None
        # and model_fields_set contains the field
        if self.yellow_cards is None and "yellow_cards" in self.model_fields_set:
            _dict['YellowCards'] = None

        # set to None if yellow_red_cards (nullable) is None
        # and model_fields_set contains the field
        if self.yellow_red_cards is None and "yellow_red_cards" in self.model_fields_set:
            _dict['YellowRedCards'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of TeamGame from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Assists": obj.get("Assists"),
            "BlockedShots": obj.get("BlockedShots"),
            "CornersWon": obj.get("CornersWon"),
            "Crosses": obj.get("Crosses"),
            "DateTime": obj.get("DateTime"),
            "Day": obj.get("Day"),
            "DefenderCleanSheets": obj.get("DefenderCleanSheets"),
            "FantasyPoints": obj.get("FantasyPoints"),
            "FantasyPointsDraftKings": obj.get("FantasyPointsDraftKings"),
            "FantasyPointsFanDuel": obj.get("FantasyPointsFanDuel"),
            "FantasyPointsMondogoal": obj.get("FantasyPointsMondogoal"),
            "FantasyPointsYahoo": obj.get("FantasyPointsYahoo"),
            "Fouled": obj.get("Fouled"),
            "Fouls": obj.get("Fouls"),
            "GameId": obj.get("GameId"),
            "Games": obj.get("Games"),
            "GlobalGameId": obj.get("GlobalGameId"),
            "GlobalOpponentId": obj.get("GlobalOpponentId"),
            "GlobalTeamId": obj.get("GlobalTeamId"),
            "GoalkeeperCleanSheets": obj.get("GoalkeeperCleanSheets"),
            "GoalkeeperGoalsAgainst": obj.get("GoalkeeperGoalsAgainst"),
            "GoalkeeperSaves": obj.get("GoalkeeperSaves"),
            "GoalkeeperSingleGoalAgainst": obj.get("GoalkeeperSingleGoalAgainst"),
            "GoalkeeperWins": obj.get("GoalkeeperWins"),
            "Goals": obj.get("Goals"),
            "HomeOrAway": obj.get("HomeOrAway"),
            "Interceptions": obj.get("Interceptions"),
            "IsGameOver": obj.get("IsGameOver"),
            "LastManTackle": obj.get("LastManTackle"),
            "Minutes": obj.get("Minutes"),
            "Name": obj.get("Name"),
            "Offsides": obj.get("Offsides"),
            "Opponent": obj.get("Opponent"),
            "OpponentId": obj.get("OpponentId"),
            "OpponentScore": obj.get("OpponentScore"),
            "OwnGoals": obj.get("OwnGoals"),
            "Passes": obj.get("Passes"),
            "PassesCompleted": obj.get("PassesCompleted"),
            "PenaltiesConceded": obj.get("PenaltiesConceded"),
            "PenaltiesWon": obj.get("PenaltiesWon"),
            "PenaltyKickGoals": obj.get("PenaltyKickGoals"),
            "PenaltyKickMisses": obj.get("PenaltyKickMisses"),
            "PenaltyKickSaves": obj.get("PenaltyKickSaves"),
            "Possession": obj.get("Possession"),
            "RedCards": obj.get("RedCards"),
            "RoundId": obj.get("RoundId"),
            "Score": obj.get("Score"),
            "Season": obj.get("Season"),
            "SeasonType": obj.get("SeasonType"),
            "Shots": obj.get("Shots"),
            "ShotsOnGoal": obj.get("ShotsOnGoal"),
            "StatId": obj.get("StatId"),
            "Tackles": obj.get("Tackles"),
            "TacklesWon": obj.get("TacklesWon"),
            "Team": obj.get("Team"),
            "TeamId": obj.get("TeamId"),
            "Touches": obj.get("Touches"),
            "Updated": obj.get("Updated"),
            "UpdatedUtc": obj.get("UpdatedUtc"),
            "YellowCards": obj.get("YellowCards"),
            "YellowRedCards": obj.get("YellowRedCards")
        })
        return _obj


