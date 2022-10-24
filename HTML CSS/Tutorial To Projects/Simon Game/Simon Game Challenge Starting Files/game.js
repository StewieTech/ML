var buttonColours = ['red', 'blue', 'green', 'yellow'];

var gamePattern = [];
var userClickedPattern = [];

var level = 0;
var started = false;


$(document).keypress(function() {
  if (!started) {
    $("#level-title").text("Level " + level);
    nextSequence();
    started = true;
  }
});

$(".btn").click(function() {

  var userChosenColour = $(this).attr("id");
  userClickedPattern.push(userChosenColour);

  playSound(userChosenColour);
  animatePress(userChosenColour);


  checkAnswer(userClickedPattern.length-1);
});



function checkAnswer(currentLevel) {


  if (gamePattern[currentLevel]  === userClickedPattern[currentLevel])  {

    console.log("success");


    if (userClickedPattern.length === gamePattern.length) {


      setTimeout(function() {
        nextSequence();
      }, 1000);
    }
  } else {
    playSound("wrong");
    animateGameOver();
    $("#level-title").text("Game Over! Press Any Key to Restart");
    startOver();
    console.log("wrong");
  }
}

// $("button").click(function() {
//   $("h1").css("color","purple");
// });

function nextSequence() {


  userClickedPattern = []

  level++;
  $("#level-title").text("Level " + level);

  var randomNumber = Math.floor(Math.random() * 3) + 1;
  var randomChosenColour = buttonColours[randomNumber];
  gamePattern.push(randomChosenColour)

  $("#" + randomChosenColour).fadeIn(100).fadeOut(100).fadeIn(100);
  playSound(randomChosenColour);
}

function playSound(name) {
  var audio = new Audio("sounds/" + name + ".mp3");
  audio.play();
}

// function playWrong() {
//   var audio = new Audio("sounds/" + "wrong" + ".mp3");
//   audio.play();
// }

function animatePress(currentColour) {
  $("#" + currentColour).addClass("pressed");
  setTimeout(function() {
    $("#" + currentColour).removeClass("pressed");
  }, 100);
}

function animateGameOver() {
  $("body").addClass("game-over");
  setTimeout(function() {
    $("body").removeClass("game-over");
  }, 200);
}

function startOver() {
  level = 0;
  gamePattern = [];
  started = false;
}

//
// }
// --.delay(500).removeClass("pressed");

// $("." + userChosenColour).click(playSound() {
//   var audio = new Audio("sounds/" + userChosenColour + ".mp3");
//   audio.play();
// });

// $("green").on("click", nextSequence() {
//   $("green").animate({opacity: 0.5)
// })


// $('.green').click(function() {
//   var audio = new Audio("sounds/" + $(this).attr('id') + ".mp3");
//   audio.play();
// });

// $('#randomChosenColour').click(function() {
//   var audio = new Audio("sounds/green.mp3");
//   audio.play();
