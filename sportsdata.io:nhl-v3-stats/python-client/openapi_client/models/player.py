# coding: utf-8

"""
    NHL v3 Stats

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class Player(BaseModel):
    """
    Player
    """ # noqa: E501
    birth_city: Optional[StrictStr] = Field(default=None, alias="BirthCity")
    birth_date: Optional[StrictStr] = Field(default=None, alias="BirthDate")
    birth_state: Optional[StrictStr] = Field(default=None, alias="BirthState")
    catches: Optional[StrictStr] = Field(default=None, alias="Catches")
    depth_chart_order: Optional[StrictInt] = Field(default=None, alias="DepthChartOrder")
    depth_chart_position: Optional[StrictStr] = Field(default=None, alias="DepthChartPosition")
    draft_kings_name: Optional[StrictStr] = Field(default=None, alias="DraftKingsName")
    draft_kings_player_id: Optional[StrictInt] = Field(default=None, alias="DraftKingsPlayerID")
    fan_duel_name: Optional[StrictStr] = Field(default=None, alias="FanDuelName")
    fan_duel_player_id: Optional[StrictInt] = Field(default=None, alias="FanDuelPlayerID")
    fantasy_alarm_player_id: Optional[StrictInt] = Field(default=None, alias="FantasyAlarmPlayerID")
    fantasy_draft_name: Optional[StrictStr] = Field(default=None, alias="FantasyDraftName")
    fantasy_draft_player_id: Optional[StrictInt] = Field(default=None, alias="FantasyDraftPlayerID")
    first_name: Optional[StrictStr] = Field(default=None, alias="FirstName")
    global_team_id: Optional[StrictInt] = Field(default=None, alias="GlobalTeamID")
    height: Optional[StrictInt] = Field(default=None, alias="Height")
    injury_body_part: Optional[StrictStr] = Field(default=None, alias="InjuryBodyPart")
    injury_notes: Optional[StrictStr] = Field(default=None, alias="InjuryNotes")
    injury_start_date: Optional[StrictStr] = Field(default=None, alias="InjuryStartDate")
    injury_status: Optional[StrictStr] = Field(default=None, alias="InjuryStatus")
    jersey: Optional[StrictInt] = Field(default=None, alias="Jersey")
    last_name: Optional[StrictStr] = Field(default=None, alias="LastName")
    photo_url: Optional[StrictStr] = Field(default=None, alias="PhotoUrl")
    player_id: Optional[StrictInt] = Field(default=None, alias="PlayerID")
    position: Optional[StrictStr] = Field(default=None, alias="Position")
    roto_wire_player_id: Optional[StrictInt] = Field(default=None, alias="RotoWirePlayerID")
    rotoworld_player_id: Optional[StrictInt] = Field(default=None, alias="RotoworldPlayerID")
    shoots: Optional[StrictStr] = Field(default=None, alias="Shoots")
    sport_radar_player_id: Optional[StrictStr] = Field(default=None, alias="SportRadarPlayerID")
    sports_direct_player_id: Optional[StrictInt] = Field(default=None, alias="SportsDirectPlayerID")
    stats_player_id: Optional[StrictInt] = Field(default=None, alias="StatsPlayerID")
    status: Optional[StrictStr] = Field(default=None, alias="Status")
    team: Optional[StrictStr] = Field(default=None, alias="Team")
    team_id: Optional[StrictInt] = Field(default=None, alias="TeamID")
    usa_today_headshot_no_background_updated: Optional[StrictStr] = Field(default=None, alias="UsaTodayHeadshotNoBackgroundUpdated")
    usa_today_headshot_no_background_url: Optional[StrictStr] = Field(default=None, alias="UsaTodayHeadshotNoBackgroundUrl")
    usa_today_headshot_updated: Optional[StrictStr] = Field(default=None, alias="UsaTodayHeadshotUpdated")
    usa_today_headshot_url: Optional[StrictStr] = Field(default=None, alias="UsaTodayHeadshotUrl")
    usa_today_player_id: Optional[StrictInt] = Field(default=None, alias="UsaTodayPlayerID")
    weight: Optional[StrictInt] = Field(default=None, alias="Weight")
    xml_team_player_id: Optional[StrictInt] = Field(default=None, alias="XmlTeamPlayerID")
    yahoo_name: Optional[StrictStr] = Field(default=None, alias="YahooName")
    yahoo_player_id: Optional[StrictInt] = Field(default=None, alias="YahooPlayerID")
    __properties: ClassVar[List[str]] = ["BirthCity", "BirthDate", "BirthState", "Catches", "DepthChartOrder", "DepthChartPosition", "DraftKingsName", "DraftKingsPlayerID", "FanDuelName", "FanDuelPlayerID", "FantasyAlarmPlayerID", "FantasyDraftName", "FantasyDraftPlayerID", "FirstName", "GlobalTeamID", "Height", "InjuryBodyPart", "InjuryNotes", "InjuryStartDate", "InjuryStatus", "Jersey", "LastName", "PhotoUrl", "PlayerID", "Position", "RotoWirePlayerID", "RotoworldPlayerID", "Shoots", "SportRadarPlayerID", "SportsDirectPlayerID", "StatsPlayerID", "Status", "Team", "TeamID", "UsaTodayHeadshotNoBackgroundUpdated", "UsaTodayHeadshotNoBackgroundUrl", "UsaTodayHeadshotUpdated", "UsaTodayHeadshotUrl", "UsaTodayPlayerID", "Weight", "XmlTeamPlayerID", "YahooName", "YahooPlayerID"]

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
        """Create an instance of Player from a JSON string"""
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
        # set to None if birth_city (nullable) is None
        # and model_fields_set contains the field
        if self.birth_city is None and "birth_city" in self.model_fields_set:
            _dict['BirthCity'] = None

        # set to None if birth_date (nullable) is None
        # and model_fields_set contains the field
        if self.birth_date is None and "birth_date" in self.model_fields_set:
            _dict['BirthDate'] = None

        # set to None if birth_state (nullable) is None
        # and model_fields_set contains the field
        if self.birth_state is None and "birth_state" in self.model_fields_set:
            _dict['BirthState'] = None

        # set to None if catches (nullable) is None
        # and model_fields_set contains the field
        if self.catches is None and "catches" in self.model_fields_set:
            _dict['Catches'] = None

        # set to None if depth_chart_order (nullable) is None
        # and model_fields_set contains the field
        if self.depth_chart_order is None and "depth_chart_order" in self.model_fields_set:
            _dict['DepthChartOrder'] = None

        # set to None if depth_chart_position (nullable) is None
        # and model_fields_set contains the field
        if self.depth_chart_position is None and "depth_chart_position" in self.model_fields_set:
            _dict['DepthChartPosition'] = None

        # set to None if draft_kings_name (nullable) is None
        # and model_fields_set contains the field
        if self.draft_kings_name is None and "draft_kings_name" in self.model_fields_set:
            _dict['DraftKingsName'] = None

        # set to None if draft_kings_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.draft_kings_player_id is None and "draft_kings_player_id" in self.model_fields_set:
            _dict['DraftKingsPlayerID'] = None

        # set to None if fan_duel_name (nullable) is None
        # and model_fields_set contains the field
        if self.fan_duel_name is None and "fan_duel_name" in self.model_fields_set:
            _dict['FanDuelName'] = None

        # set to None if fan_duel_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.fan_duel_player_id is None and "fan_duel_player_id" in self.model_fields_set:
            _dict['FanDuelPlayerID'] = None

        # set to None if fantasy_alarm_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.fantasy_alarm_player_id is None and "fantasy_alarm_player_id" in self.model_fields_set:
            _dict['FantasyAlarmPlayerID'] = None

        # set to None if fantasy_draft_name (nullable) is None
        # and model_fields_set contains the field
        if self.fantasy_draft_name is None and "fantasy_draft_name" in self.model_fields_set:
            _dict['FantasyDraftName'] = None

        # set to None if fantasy_draft_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.fantasy_draft_player_id is None and "fantasy_draft_player_id" in self.model_fields_set:
            _dict['FantasyDraftPlayerID'] = None

        # set to None if first_name (nullable) is None
        # and model_fields_set contains the field
        if self.first_name is None and "first_name" in self.model_fields_set:
            _dict['FirstName'] = None

        # set to None if global_team_id (nullable) is None
        # and model_fields_set contains the field
        if self.global_team_id is None and "global_team_id" in self.model_fields_set:
            _dict['GlobalTeamID'] = None

        # set to None if height (nullable) is None
        # and model_fields_set contains the field
        if self.height is None and "height" in self.model_fields_set:
            _dict['Height'] = None

        # set to None if injury_body_part (nullable) is None
        # and model_fields_set contains the field
        if self.injury_body_part is None and "injury_body_part" in self.model_fields_set:
            _dict['InjuryBodyPart'] = None

        # set to None if injury_notes (nullable) is None
        # and model_fields_set contains the field
        if self.injury_notes is None and "injury_notes" in self.model_fields_set:
            _dict['InjuryNotes'] = None

        # set to None if injury_start_date (nullable) is None
        # and model_fields_set contains the field
        if self.injury_start_date is None and "injury_start_date" in self.model_fields_set:
            _dict['InjuryStartDate'] = None

        # set to None if injury_status (nullable) is None
        # and model_fields_set contains the field
        if self.injury_status is None and "injury_status" in self.model_fields_set:
            _dict['InjuryStatus'] = None

        # set to None if jersey (nullable) is None
        # and model_fields_set contains the field
        if self.jersey is None and "jersey" in self.model_fields_set:
            _dict['Jersey'] = None

        # set to None if last_name (nullable) is None
        # and model_fields_set contains the field
        if self.last_name is None and "last_name" in self.model_fields_set:
            _dict['LastName'] = None

        # set to None if photo_url (nullable) is None
        # and model_fields_set contains the field
        if self.photo_url is None and "photo_url" in self.model_fields_set:
            _dict['PhotoUrl'] = None

        # set to None if position (nullable) is None
        # and model_fields_set contains the field
        if self.position is None and "position" in self.model_fields_set:
            _dict['Position'] = None

        # set to None if roto_wire_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.roto_wire_player_id is None and "roto_wire_player_id" in self.model_fields_set:
            _dict['RotoWirePlayerID'] = None

        # set to None if rotoworld_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.rotoworld_player_id is None and "rotoworld_player_id" in self.model_fields_set:
            _dict['RotoworldPlayerID'] = None

        # set to None if shoots (nullable) is None
        # and model_fields_set contains the field
        if self.shoots is None and "shoots" in self.model_fields_set:
            _dict['Shoots'] = None

        # set to None if sport_radar_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.sport_radar_player_id is None and "sport_radar_player_id" in self.model_fields_set:
            _dict['SportRadarPlayerID'] = None

        # set to None if sports_direct_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.sports_direct_player_id is None and "sports_direct_player_id" in self.model_fields_set:
            _dict['SportsDirectPlayerID'] = None

        # set to None if stats_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.stats_player_id is None and "stats_player_id" in self.model_fields_set:
            _dict['StatsPlayerID'] = None

        # set to None if status (nullable) is None
        # and model_fields_set contains the field
        if self.status is None and "status" in self.model_fields_set:
            _dict['Status'] = None

        # set to None if team (nullable) is None
        # and model_fields_set contains the field
        if self.team is None and "team" in self.model_fields_set:
            _dict['Team'] = None

        # set to None if team_id (nullable) is None
        # and model_fields_set contains the field
        if self.team_id is None and "team_id" in self.model_fields_set:
            _dict['TeamID'] = None

        # set to None if usa_today_headshot_no_background_updated (nullable) is None
        # and model_fields_set contains the field
        if self.usa_today_headshot_no_background_updated is None and "usa_today_headshot_no_background_updated" in self.model_fields_set:
            _dict['UsaTodayHeadshotNoBackgroundUpdated'] = None

        # set to None if usa_today_headshot_no_background_url (nullable) is None
        # and model_fields_set contains the field
        if self.usa_today_headshot_no_background_url is None and "usa_today_headshot_no_background_url" in self.model_fields_set:
            _dict['UsaTodayHeadshotNoBackgroundUrl'] = None

        # set to None if usa_today_headshot_updated (nullable) is None
        # and model_fields_set contains the field
        if self.usa_today_headshot_updated is None and "usa_today_headshot_updated" in self.model_fields_set:
            _dict['UsaTodayHeadshotUpdated'] = None

        # set to None if usa_today_headshot_url (nullable) is None
        # and model_fields_set contains the field
        if self.usa_today_headshot_url is None and "usa_today_headshot_url" in self.model_fields_set:
            _dict['UsaTodayHeadshotUrl'] = None

        # set to None if usa_today_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.usa_today_player_id is None and "usa_today_player_id" in self.model_fields_set:
            _dict['UsaTodayPlayerID'] = None

        # set to None if weight (nullable) is None
        # and model_fields_set contains the field
        if self.weight is None and "weight" in self.model_fields_set:
            _dict['Weight'] = None

        # set to None if xml_team_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.xml_team_player_id is None and "xml_team_player_id" in self.model_fields_set:
            _dict['XmlTeamPlayerID'] = None

        # set to None if yahoo_name (nullable) is None
        # and model_fields_set contains the field
        if self.yahoo_name is None and "yahoo_name" in self.model_fields_set:
            _dict['YahooName'] = None

        # set to None if yahoo_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.yahoo_player_id is None and "yahoo_player_id" in self.model_fields_set:
            _dict['YahooPlayerID'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Player from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "BirthCity": obj.get("BirthCity"),
            "BirthDate": obj.get("BirthDate"),
            "BirthState": obj.get("BirthState"),
            "Catches": obj.get("Catches"),
            "DepthChartOrder": obj.get("DepthChartOrder"),
            "DepthChartPosition": obj.get("DepthChartPosition"),
            "DraftKingsName": obj.get("DraftKingsName"),
            "DraftKingsPlayerID": obj.get("DraftKingsPlayerID"),
            "FanDuelName": obj.get("FanDuelName"),
            "FanDuelPlayerID": obj.get("FanDuelPlayerID"),
            "FantasyAlarmPlayerID": obj.get("FantasyAlarmPlayerID"),
            "FantasyDraftName": obj.get("FantasyDraftName"),
            "FantasyDraftPlayerID": obj.get("FantasyDraftPlayerID"),
            "FirstName": obj.get("FirstName"),
            "GlobalTeamID": obj.get("GlobalTeamID"),
            "Height": obj.get("Height"),
            "InjuryBodyPart": obj.get("InjuryBodyPart"),
            "InjuryNotes": obj.get("InjuryNotes"),
            "InjuryStartDate": obj.get("InjuryStartDate"),
            "InjuryStatus": obj.get("InjuryStatus"),
            "Jersey": obj.get("Jersey"),
            "LastName": obj.get("LastName"),
            "PhotoUrl": obj.get("PhotoUrl"),
            "PlayerID": obj.get("PlayerID"),
            "Position": obj.get("Position"),
            "RotoWirePlayerID": obj.get("RotoWirePlayerID"),
            "RotoworldPlayerID": obj.get("RotoworldPlayerID"),
            "Shoots": obj.get("Shoots"),
            "SportRadarPlayerID": obj.get("SportRadarPlayerID"),
            "SportsDirectPlayerID": obj.get("SportsDirectPlayerID"),
            "StatsPlayerID": obj.get("StatsPlayerID"),
            "Status": obj.get("Status"),
            "Team": obj.get("Team"),
            "TeamID": obj.get("TeamID"),
            "UsaTodayHeadshotNoBackgroundUpdated": obj.get("UsaTodayHeadshotNoBackgroundUpdated"),
            "UsaTodayHeadshotNoBackgroundUrl": obj.get("UsaTodayHeadshotNoBackgroundUrl"),
            "UsaTodayHeadshotUpdated": obj.get("UsaTodayHeadshotUpdated"),
            "UsaTodayHeadshotUrl": obj.get("UsaTodayHeadshotUrl"),
            "UsaTodayPlayerID": obj.get("UsaTodayPlayerID"),
            "Weight": obj.get("Weight"),
            "XmlTeamPlayerID": obj.get("XmlTeamPlayerID"),
            "YahooName": obj.get("YahooName"),
            "YahooPlayerID": obj.get("YahooPlayerID")
        })
        return _obj


