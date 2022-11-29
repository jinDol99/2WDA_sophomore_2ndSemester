import tensorflow as tf
import numpy as np
from tensorflow.keras.datasets import mnist

(x_train, t_train), (x_test, t_test) = mnist.load_data()

print('\n train shape =', x_train.shape, ', train label shape = ', t_train.shape)
print('test shape =', x_test.shape, ', test label shape = ', t_test.shape)

print('\n train label = ', t_train)
print('test label = ', t_test)
# Downloading data from https://storage.googleapis.com/tensorflow/tf-keras-datasets/mnist.npz
# 11490434/11490434 [==============================] - 0s 0us/step
#  train shape = (60000, 28, 28) , train label shape =  (60000,)
# test shape = (10000, 28, 28) , test label shape =  (10000,)
#  train label =  [5 0 4 ... 5 6 8]
# test label =  [7 2 1 ... 4 5 6]

print(x_train[0])
# [[  0   0   0   0   0   0   0   0   0   0   0   0 ...

import matplotlib.pyplot as plt

plt.figure(figsize=(6,6))

for index in range(25):
  plt.subplot( 5, 5, index + 1)
  plt.imshow(x_train[index], cmap='gray')
  plt.axis('off')
plt.show()
# 25개의 손그림 숫자 이미지가 출력

x_train = (x_train - 0.0) / (255.0 - 0.0)
x_test = (x_test - 0.0) / (255.0 - 0.0)

t_train = tf.keras.utils.to_categorical(t_train, num_classes=10)
t_test = tf.keras.utils.to_categorical(t_test, num_classes=10)
# 학습 데이터를 0 ~ 255 가 아닌 0.0 ~ 1.0의 범위로 변경(정규화)
# 그 후 정답 데이터 원핫 인코딩

print(x_train[0])
# [ 0.53333333 0.99215686 0.99215686 0.99215686 0.83137255 0.52941176 0.51764706 0.0627451

model = tf.keras.Sequential()
model.add(tf.keras.layers.Flatten(input_shape=(28, 28)))
model.add(tf.keras.layers.Dense(100, activation='relu'))
model.add(tf.keras.layers.Dense(10, activation='softmax'))

model.compile(optimizer=tf.keras.optimizers.Adam(learning_rate=1e-3), loss='categorical_crossentropy', metrics=['accuracy'])

model.summary()
# 인공신경망을 구축하는 단계.
# 기존 텐서플로우 1.0에서는 레이어마다 행과 열을 전부 지정해야 했지만
# 2.0에서는 레이어에 들어갈 뉴럽 개수만 입력하면 되서 편함 

# Model: "sequential_1"
# _________________________________________________________________
#  Layer (type)                Output Shape              Param #   
# =================================================================
#  flatten_1 (Flatten)         (None, 784)               0                                                             
#  dense_2 (Dense)             (None, 100)               78500                                                             
#  dense_3 (Dense)             (None, 10)                1010                                                          
# =================================================================
# Total params: 79,510
# Trainable params: 79,510
# Non-trainable params: 0

hist = model.fit(x_train, t_train, epochs=30, validation_split=0.3)
# 학습 실행. x_train은 x축, t_train은 y축, epochs는 반복 횟수를 의미.
# Epoch 1/30
# 1313/1313 [==============================] - 7s 5ms/step - loss: 0.3043 - accuracy: 0.9141 - val_loss: 0.1797 - val_accuracy: 0.9490
# ...
# Epoch 30/30
# 1313/1313 [==============================] - 5s 4ms/step - loss: 0.0026 - accuracy: 0.9993 - val_loss: 0.1507 - val_accuracy: 0.9741

model.evaluate(x_test, t_test)
# 학습 모델 검증하는 코드. accuracy가 정확도이며, 1에 가까울수록 높은 정확도임.
# 313/313 [==============================] - 1s 3ms/step - loss: 0.1089 - accuracy: 0.9782
# [0.10894658416509628, 0.9782000184059143]

plt.title('Loss')
plt.xlabel('epochs')
plt.ylabel('loss')
plt.grid()

plt.plot(hist.history['loss'], label='train loss')
plt.plot(hist.history['val_loss'], label='validation loss')

plt.legend(loc='best')

plt.show()
# 학습된 결과 데이터를 시각적 꺽은선 차트로 출력

plt.title('Accuracy')
plt.xlabel('epochs')
plt.ylabel('accuracy')
plt.grid()

plt.plot(hist.history['accuracy'], label='train loss')
plt.plot(hist.history['val_accuracy'], label='validation loss')

plt.legend(loc='best')

plt.show()
# 손실 및 정확도 그래프를 출력